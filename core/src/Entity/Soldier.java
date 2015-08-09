package entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Soldier extends DynamicEntity
{
	public Soldier()
	{
		super(new Sprite(new Texture(Gdx.files.internal("data/trooper.png"))));
	}
}
