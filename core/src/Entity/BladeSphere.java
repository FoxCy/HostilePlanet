package Entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

public class BladeSphere extends DynamicEntity
{
	int state;
	
	public BladeSphere()
	{
		texture = new Texture(Gdx.files.internal("data/BladeSphere.png"));
		sprite = new Sprite(texture);
		
		setWidth(sprite.getWidth());
		setHeight(sprite.getHeight());
	}
	
	@Override
	public void act(float delta)
	{
		super.act(delta);
		System.out.println(super.body.getLinearVelocity());
		//body.applyForceToCenter(new Vector2(0, 0), true);
	}
}
