package entity;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;

public abstract class DynamicEntity extends Entity
{	
	protected Vector2 NORTH_MOVE = new Vector2(0, 10000);
	protected Vector2 SOUTH_MOVE = new Vector2(0, -10000);
	protected Vector2 EAST_MOVE = new Vector2(10000, 0);
	protected Vector2 WEST_MOVE = new Vector2(-10000, 0);

	public DynamicEntity(Sprite sprite)
	{
		super(sprite);
	}

	@Override
	public void act(float Delta)
	{
		setX(body.getPosition().x);
		setY(body.getPosition().y);
	
		setRotation(MathUtils.radiansToDegrees * body.getAngle());
	}

	/**
	 * Create the actor in the physics simulation
	 * @param world
	 */
	public void initPhysics(World world)
	{
		// Define the physics object, type, and position
		BodyDef bodyDef = new BodyDef();
		bodyDef.type = BodyDef.BodyType.DynamicBody;
		bodyDef.position.set(getX(), getY());

		// Create the world body for this actor
		body = world.createBody(bodyDef);

		// Set physical properties
		PolygonShape shape = new PolygonShape();
		shape.setAsBox(getWidth() / 2, getHeight() / 2);

		FixtureDef fixtureDef = new FixtureDef();
		fixtureDef.shape = shape;
		fixtureDef.density = 1f;
		fixtureDef.restitution = 0.5f;

		body.createFixture(fixtureDef);

		shape.dispose();
	}
	
	public boolean moveInDirection(Entity.Direction dir)
	{
		switch (dir) 
		{
			case NORTH: body.applyForceToCenter(NORTH_MOVE, true); break;
			case SOUTH: body.applyForceToCenter(SOUTH_MOVE, true); break;
			case EAST: body.applyForceToCenter(EAST_MOVE, true); break;
			case WEST: body.applyForceToCenter(WEST_MOVE, true); break;
		}
		
		return true;
	}
}