package Entity;


import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;

public abstract class StaticEntity extends Entity
{
	/**
	 * Create the actor in the physics simulation
	 * @param world
	 */
	public void initPhysics(World world)
	{
		// Define the physics object, type, and position
		BodyDef bodyDef = new BodyDef();
		bodyDef.type = BodyDef.BodyType.StaticBody;
		bodyDef.position.set(getX(), getY());

		// Create the world body for this actor
		body = world.createBody(bodyDef);

		// Set physical properties
		PolygonShape shape = new PolygonShape();
		shape.setAsBox(getWidth() / 2, getHeight() / 2);

		FixtureDef fixtureDef = new FixtureDef();
		fixtureDef.shape = shape;
		fixtureDef.density = 0.1f;

		Fixture fixture = body.createFixture(fixtureDef);

		shape.dispose();
	}
}
