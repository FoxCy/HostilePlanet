package com.fox.hostileplanet;

import java.util.List;


import com.badlogic.gdx.InputProcessor;

import entity.Controllable;
import entity.Entity;

public class UserInputHandler implements InputProcessor
{
	private List<Entity> listeners;

	@Override
	public boolean keyDown(int keycode)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp(int keycode)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount)
	{
		// TODO Auto-generated method stub
		return false;
	}

	public List<Entity> getListeners()
	{
		return listeners;
	}

	public void addListener(Entity listener)
	{
		listeners.add(listener);
	}
	
	public void removeListener(Controllable listener)
	{
		listeners.remove(listener);
	}
}
