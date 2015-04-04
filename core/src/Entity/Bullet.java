package Entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

public class Bullet extends DynamicEntity
{
	public Bullet(int x, int y, Vector2 vi)
	{
		super.texture = new Texture(Gdx.files.internal("pbullet.png"));
		super.sprite = new Sprite(texture);
		
		setWidth(sprite.getWidth());
		setHeight(sprite.getHeight());
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
}
