package entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class ConcreteWall extends StaticEntity
{
	public ConcreteWall()
	{
		super(new Sprite(new Texture(Gdx.files.internal("data/Wall1 copy.gif"))));
	}
}
