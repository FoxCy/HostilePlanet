package entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

public abstract class Bullet extends DynamicEntity
{
	public Bullet(int x, int y, Vector2 vi, Sprite sprite)
	{
		super(new Sprite(new Texture(Gdx.files.internal("data/bullet.png"))));
	}
	
	@Override
	public void act(float delta)
	{
		super.act(delta);
	}
	
	@Override
	public void initPhysics(World world)
	{
		super.initPhysics(world);
	}
	
	@Override
	public void draw(Batch batch, float alpha)
	{
		batch.draw(sprite, getX(), getY(), getOriginX(), getOriginY(), getWidth(), getHeight(), 
				getScaleX(), getScaleY(), getRotation());
	}
}
