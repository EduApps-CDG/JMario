package net.eduapps.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.ai.btree.leaf.*;
import com.badlogic.gdx.*;
import net.eduapps.game.scene.*;

public class AndroidGame extends Game {

	@Override
	public void create() {
		setScreen(new Logo(this));
	}

	@Override
	public void render() {
		super.render();
	}

	@Override
	public void dispose() {
	}
}
