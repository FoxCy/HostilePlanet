package entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.World;

public class BladeSphere extends DynamicEntity
{
	int state;
	
	public BladeSphere()
	{
		super(new Sprite(new Texture(Gdx.files.internal("data/BladeSphere.png"))));
	}
	
	@Override
	public void act(float delta)
	{
		super.act(delta);
		
		body.applyAngularImpulse(-200000, true);
	}
	
	@Override
	public void initPhysics(World world)
	{
		super.initPhysics(world);
		
		body.setAngularDamping(0.20f);
	}
}
