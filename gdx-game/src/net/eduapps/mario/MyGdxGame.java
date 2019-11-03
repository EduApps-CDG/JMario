package net.eduapps.mario;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import net.eduapps.mario.scene.*;

public class MyGdxGame extends Game implements ApplicationListener {

	@Override public void create() {
		setScreen(new LogosScreen(this));
	}

	@Override public void render() {        
	    Gdx.gl.glClearColor(0, 0, 0, 1);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}

	@Override public void dispose() {
	}

	@Override public void resize(int width, int height) {
	}

	@Override public void pause() {
	}

	@Override public void resume() {
	}
}
