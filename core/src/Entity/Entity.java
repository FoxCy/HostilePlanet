package entity;

import java.util.Map;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.scenes.scene2d.Actor;

import entity.component.Component;

public abstract class Entity extends Actor
{
	public enum Direction 
	{
		NORTH,
		SOUTH,
		EAST,
		WEST
	}
	
	protected Sprite sprite; 
	protected Body body;
	
	protected Map<String, Component> components;
	
	public Entity()
	{}
	
	public Entity(Sprite sprite)
	{
		this.sprite = sprite;
		
		setWidth(sprite.getWidth());
		setHeight(sprite.getHeight());
		setOrigin(getWidth() / 2.0f, getHeight() / 2.0f);
	}

	@Override
	public void draw(Batch batch, float alpha)
	{
		batch.draw(sprite, getX(), getY(), getOriginX(), getOriginY(), getWidth(), getHeight(), 
				getScaleX(), getScaleY(), getRotation());
	}
	
	public Component getComponent(String identifier) {
		return null;
	}
	
	public Component setComponent(Component c) {
		return c;
	}
}
