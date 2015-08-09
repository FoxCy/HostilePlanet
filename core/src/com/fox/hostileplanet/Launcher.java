package com.fox.hostileplanet;


import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.math.Vector2;

import com.badlogic.gdx.physics.box2d.World;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

import entity.BladeSphere;
import entity.ConcreteWall;
import entity.Player;
import entity.Soldier;

public class Launcher implements ApplicationListener
{
	private Stage	stage;
	private World	world;
	private Player  player;
	private boolean	paused	= false;

	@Override
	public void create()
	{
		stage = new Stage(new ExtendViewport(Gdx.graphics.getWidth(), Gdx.graphics.getHeight()));
		world = new World(new Vector2(0, 0), true);
		player = new Player();
		
		Gdx.input.setInputProcessor(player);

		ConcreteWall walls[] = new ConcreteWall[20];
		for (int i = 0; i < walls.length; i++)
		{
			walls[i] = new ConcreteWall();
			walls[i].setCenterPosition(i * walls[i].getWidth() + 100, 50);
			stage.addActor(walls[i]);
			walls[i].initPhysics(world);
		}
		BladeSphere myActor = new BladeSphere();
		Soldier playerChar = new Soldier();
		
		myActor.setCenterPosition((Gdx.graphics.getWidth() / 2), (Gdx.graphics.getHeight() / 2));
		playerChar.setCenterPosition((Gdx.graphics.getWidth() / 3), (Gdx.graphics.getHeight() / 3));
		
		stage.addActor(myActor);
		stage.addActor(playerChar);
		
		myActor.initPhysics(world);
		playerChar.initPhysics(world);
	}

	@Override
	public void resize(int width, int height)
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void render()
	{
		if (!paused)
		{
			world.step(1f/60f, 6, 2);
			stage.act(Gdx.graphics.getDeltaTime());

			Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);
			stage.draw();
		}
	}

	@Override
	public void pause()
	{
		paused = true;
	}

	@Override
	public void resume()
	{
		paused = false;
	}

	@Override
	public void dispose()
	{
		world.dispose();
		stage.dispose();
	}
}
