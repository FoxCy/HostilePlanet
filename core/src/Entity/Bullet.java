package Entity;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

public class Bullet extends DynamicEntity
{
	public Bullet(int x, int y, Vector2 vi)
	{
		
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
