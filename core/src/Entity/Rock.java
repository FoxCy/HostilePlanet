package entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.World;

public class Rock extends DynamicEntity
{
	public Rock()
	{
		super(new Sprite(new Texture(Gdx.files.internal("data/BladeSphere.png"))));
	}
	
	@Override
	public void initPhysics(World world)
	{
		super.initPhysics(world);
		
		body.setAngularDamping(0.20f);
	}
}
