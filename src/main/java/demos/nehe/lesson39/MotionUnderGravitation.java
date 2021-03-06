package demos.nehe.lesson39;

import java.util.Iterator;

/*
 class MotionUnderGravitation is derived from class Simulation
 It creates 1 mass with mass value 1 kg and sets its velocity to (10.0f, 15.0f, 0.0f) and its position to
 (-10.0f, 0.0f, 0.0f). The purpose of this application is to apply a gravitational force to the mass and
 observe the path it follows. The above velocity and position provides a fine projectile path with a
 9.81 m/s/s downward gravitational acceleration. 9.81 m/s/s is a very close value to the gravitational
 acceleration we experience on the earth.
 */

class MotionUnderGravitation extends Simulation {
	// the gravitational acceleration
	private Vector3D gravitation;

	// Constructor firstly constructs its super class with 1 mass and 1 kg
	public MotionUnderGravitation(Vector3D gravitation) {
		// Vector3D gravitation, is the gravitational acceleration
		// set this class's gravitation
		this.gravitation = gravitation;
		Mass mass = new Mass(1.0f);
		// a mass was created and we set its position to the origin
		mass.pos = new Vector3D(-10.0f, 0.0f, 0.0f);
		// we set the mass's velocity to (1.0f, 0.0f, 0.0f)
		mass.vel = new Vector3D(10.0f, 15.0f, 0.0f);
		addMass(mass);
	}

	// gravitational force will be applied therefore we need a "solve" method.
	public void solve() {
		// we will apply force to all masses (actually we have 1 mass, but we
		// can extend it in the future)
		Iterator masses = getMasses();
		while (masses.hasNext()) {
			Mass mass = (Mass) masses.next();
			// gravitational force is as F = m * g. (mass times the
			// gravitational acceleration)
			mass.applyForce(new Vector3D(gravitation).scale(mass.m));
		}
	}

};
