package entity;

import com.badlogic.gdx.InputProcessor;

public class Player implements InputProcessor
{
	private Controllable player;
	
	public Player()
	{
		this.setPlayer(new NullPlayer());
	}
	
	public Player(Controllable playerEntity) 
	{
		this.setPlayer(playerEntity);
	}

	@Override
	public boolean keyDown(int keycode)
	{
		return getPlayer().keyDown(keycode);
	}

	@Override
	public boolean keyUp(int keycode)
	{
		return getPlayer().keyUp(keycode);
	}

	@Override
	public boolean keyTyped(char character)
	{
		return getPlayer().keyTyped(character);
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button)
	{
		return getPlayer().touchDown(screenX, screenY, pointer, button);
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button)
	{
		return getPlayer().touchUp(screenX, screenY, pointer, button);
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer)
	{
		return getPlayer().touchDragged(screenX, screenY, pointer);
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY)
	{
		return getPlayer().mouseMoved(screenX, screenY);
	}

	@Override
	public boolean scrolled(int amount)
	{
		return getPlayer().scrolled(amount);
	}

	public Controllable getPlayer()
	{
		return player;
	}

	public void setPlayer(Controllable player)
	{
		this.player = player;
	}
}

class NullPlayer implements Controllable
{
	@Override
	public boolean keyDown(int keycode)
	{
		return false;
	}

	@Override
	public boolean keyUp(int keycode)
	{
		return false;
	}

	@Override
	public boolean keyTyped(char character)
	{
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button)
	{
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button)
	{
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer)
	{
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY)
	{
		return false;
	}

	@Override
	public boolean scrolled(int amount)
	{
		return false;
	}

	@Override
	public void disableControls()
	{}

	@Override
	public void enableControls()
	{}
}
