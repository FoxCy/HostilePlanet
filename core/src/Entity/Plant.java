package entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Plant extends StaticEntity 
{
	public Plant()
	{
		super(new Sprite(new Texture(Gdx.files.internal("data/tree_50.png"))));
	}

}
