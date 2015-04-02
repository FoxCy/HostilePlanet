package Entity;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.scenes.scene2d.Actor;

public abstract class Entity extends Actor
{
	protected Texture texture; 
	protected Sprite sprite; 
	protected Body body;

	@Override
	public void draw(Batch batch, float alpha)
	{
		batch.draw(sprite, getX(), getY());
	}
}
