package com.flappybird.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture background;
	Texture bird[]=new Texture[2];
	int flag =1;
	
	@Override
	public void create () {
     batch=new SpriteBatch();
     background=new Texture("bg.png");
     bird[0]=new Texture("bird.png");
     bird[1]=new Texture("bird2.png");

	}

	@Override
	public void render () {
		if (flag==1)
		{
			flag=0;

		}
		else
		{
			flag=1;
		}

    batch.begin();
    batch.draw(background,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
    batch.draw(bird[flag],Gdx.graphics.getWidth()/2-bird[flag].getWidth()/2,Gdx.graphics.getHeight()/2-bird[flag].getHeight()/2);
    batch.end();;
	}
	
	@Override
	public void dispose () {

	}
}
