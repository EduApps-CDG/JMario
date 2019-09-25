package net.eduapps.game.scene;
import com.badlogic.gdx.*;
import com.badlogic.gdx.physics.box2d.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.utils.viewport.*;
import net.eduapps.game.util.*;
import com.badlogic.gdx.graphics.glutils.*;

public class DebugMode implements Screen {
	private Game GAME;
	
	ShapeRenderer r;
	World world;
	OrthographicCamera camera;
	Viewport viewport;

	@Override public void show() {
		r = new ShapeRenderer();
		camera = new OrthographicCamera();

        viewport = new FitViewport(GameManager.V_WIDTH, GameManager.V_HEIGHT);
        viewport.setCamera(camera);
		//world = new World();
	}

	@Override public void render(float p1) {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		Gdx.gl.glClearColor(0,0,0,1);
		camera.update();
		r.setProjectionMatrix(camera.combined);
		r.begin(ShapeRenderer.ShapeType.Line);
		r.rect(0, 0, viewport.getWorldWidth(), viewport.getWorldHeight());
		r.end();
	}

	@Override public void resize(int p1,int p2) {
		// TODO: Implement this method
	}

	@Override public void pause() {
		// TODO: Implement this method
	}

	@Override public void resume() {
		// TODO: Implement this method
	}

	@Override public void hide() {
		// TODO: Implement this method
	}

	@Override public void dispose() {
		// TODO: Implement this method
	}
	
	public DebugMode(Game game) {
		GAME = game;
	}
}
