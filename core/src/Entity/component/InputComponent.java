package entity.component;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;

import entity.DynamicEntity;
import entity.Entity;

public class InputComponent extends Component implements InputProcessor
{
	DynamicEntity myEntity;

	@Override
	public boolean keyDown(int keycode)
	{
		boolean processed = false;
		
		if (keycode == Input.Keys.W) 
		{
			processed = myEntity.moveInDirection(Entity.Direction.NORTH);
		}
		else if (keycode == Input.Keys.S)
		{
			
		}
		else if (keycode == Input.Keys.A)
		{
			
		}
		else if (keycode == Input.Keys.D)
		{
			
		}
		
		return processed;
	}

	@Override
	public boolean keyUp(int keycode)
	{
		return true;
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

}
