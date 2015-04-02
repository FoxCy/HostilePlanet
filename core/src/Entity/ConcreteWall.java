package Entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class ConcreteWall extends StaticEntity
{
	public ConcreteWall()
	{
		texture = new Texture(Gdx.files.internal("data/Wall1 copy.gif"));
		sprite = new Sprite(texture);
		
		setWidth(sprite.getWidth());
		setHeight(sprite.getHeight());
	}
}
