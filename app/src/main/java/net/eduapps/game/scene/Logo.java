package net.eduapps.game.scene;
import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.graphics.*;

public class Logo implements Screen {
	SpriteBatch batch;
	Texture img;
	Texture img2;
	int width;
	int height;
	private Game GAME;
	private float elapsed;
	
	public Logo(Game game) {
		GAME = game;
	}
	
	@Override
	public void show() {
		batch = new SpriteBatch();
		img = new Texture(Gdx.files.internal("eduapps.png"));
		img2 = new Texture(Gdx.files.internal("libgdx.png"));
		width = Gdx.graphics.getWidth();
		height = Gdx.graphics.getHeight();
	}

	@Override
	public void render(float p1) {
		elapsed += p1;
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		Gdx.gl.glClearColor(1,1,1,1);
		batch.begin();
		batch.draw(img,(width / 2) - 50,(height / 2) - 50,100,100);
		if (elapsed > 3) {
			batch.draw(img2,(width/2)-256,(height/2)-128,512,256);
		}
		if (elapsed > 6) {
			if (Gdx.input.isKeyPressed(Input.Keys.D) && Gdx.input.isKeyPressed(Input.Keys.C)) {
				GAME.setScreen(new DebugMode(GAME));
			} else {
				GAME.setScreen(new MainMenu(GAME));
			}
		}
		batch.end();
	}

	@Override
	public void resize(int p1,int p2) {
		// TODO: Implement this method
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
		img.dispose();
	}

}
