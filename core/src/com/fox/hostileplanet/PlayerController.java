package com.fox.hostileplanet;

import java.awt.event.KeyEvent;

import Entity.DynamicEntity;
import Entity.Entity;

import com.badlogic.gdx.InputProcessor;

public class PlayerController implements InputProcessor
{
	DynamicEntity player;
	
	public PlayerController(DynamicEntity player)
	{
		this.player = player;
	}
	
	@Override
	public boolean keyDown(int keycode) 
	{
		if (keycode == KeyEvent.VK_W)
		{
			player.moveUp();
		}
		
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}
}
