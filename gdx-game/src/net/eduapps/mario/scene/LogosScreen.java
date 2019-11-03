package net.eduapps.mario.scene;
import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.graphics.*;

/**
 * @TODO: add a logo (opitional)
 */

public class LogosScreen implements Screen {
	public Game GAME;
	
	SpriteBatch batch;
	Texture eduapps;
	int center_x;
	int center_y;
	int time = 0;
	//Texture your_texture;
	
	public LogosScreen(Game game) {
		GAME = game;
		batch = new SpriteBatch();
		eduapps = new Texture(Gdx.files.internal("eduapps.png"));
		center_x = (Gdx.graphics.getWidth() / 2) - (150 / 2);
		center_y = (Gdx.graphics.getHeight() / 2) - (150 / 2);
	}
	
	@Override public void show() {
		
	}
	
	@Override public void render(float p1) {
		time += p1;
	    Gdx.gl.glClearColor(1,1,1, 1);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(eduapps,center_x,center_y,150,150);
		//if(timeSinceCollision > 1.0f) {
		// do collision stuff
		//	} else {
		// ignore the collision
		//	}
		if (Gdx.input.isKeyPressed(new Input.Keys().BUTTON_L1) && Gdx.input.isKeyPressed(new Input.Keys().BUTTON_R1)) {
			GAME.setScreen(new DebugScreen());
		} else {
			GAME.setScreen(new MainMenu());
		}
		batch.end();
	}

	@Override public void resize(int p1, int p2) {
	}

	@Override public void hide() {
		// TODO: Implement this method
	}

	@Override public void pause() {
		// TODO: Implement this method
	}

	@Override public void resume() {
		// TODO: Implement this method
	}

	@Override public void dispose() {
		batch.dispose();
	}

}
