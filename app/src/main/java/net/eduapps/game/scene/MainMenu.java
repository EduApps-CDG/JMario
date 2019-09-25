package net.eduapps.game.scene;
import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.utils.viewport.*;
import com.badlogic.gdx.physics.box2d.*;
import com.badlogic.gdx.graphics.glutils.*;
import android.util.*;

public class MainMenu implements Screen {
	private Game GAME;
	SpriteBatch batch;
	ShapeRenderer r;
	Texture bg,
			border;
	TextureRegion bg_r;
	int width;
	int height;
	OrthographicCamera camera;
	Viewport viewport;
	boolean update = false;
	
	public MainMenu(Game game) {
		GAME = game;
	}

	@Override
	public void show() {
		r = new ShapeRenderer();
		camera = new OrthographicCamera(512, 448);
		viewport = new FitViewport(512, 448, camera);
		batch = new SpriteBatch();
		bg = new Texture(Gdx.files.internal("gui/bg.png"));
		bg_r = new TextureRegion(bg,544,0,512,448);
		border = new Texture(Gdx.files.internal("libgdx.png"));
		width = Gdx.graphics.getWidth();
		height = Gdx.graphics.getHeight();
		
	}

	@Override
	public void render(float p1) {
		draw();
		//while (Gdx.input.isKeyPressed(Input.Keys.DPAD_CENTER)) {
		//if (update = false) {
		//	draw();
		//} else {
			
		//}
		//}
	}

	@Override
	public void resize(int p1,int p2) {
		viewport.update(p1, p2);
	}

	@Override
	public void pause() {
		// TODO: Implement this method
	}

	@Override
	public void resume() {
		// TODO: Implement this method
	}

	@Override
	public void hide() {
		// TODO: Implement this method
	}

	@Override
	public void dispose() {
		batch.dispose();
		bg.dispose();
		border.dispose();
	}
	
	public void draw() {
		//if (update = false) {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		Gdx.gl.glClearColor(0,0,0,1);
		camera.update();
		r.setProjectionMatrix(camera.combined);
		r.begin(ShapeRenderer.ShapeType.Line);
		r.rect(0, 0, viewport.getWorldWidth(), viewport.getWorldHeight());
		r.end();
		batch.begin();
		batch.draw(bg_r,0,0,width,height);
		if (Gdx.input.isKeyPressed(Input.Keys.DPAD_UP)) {
			batch.draw(border,0,0);
			//draw();
		} //else
		if (Gdx.input.isKeyPressed(Input.Keys.DPAD_CENTER)) {
			batch.draw(bg_r,0,0,width,height);
			//draw();
		}
		batch.end();
		//update = true;
		//} else {
		//	update = false;
		//}
	}

}
