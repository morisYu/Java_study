package chap08.sec05.art06;

import chap08.sec05.art05.Bus;
import chap08.sec05.art05.Vehicle;

public class Driver {
	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();

	}
}
