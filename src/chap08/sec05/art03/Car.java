package chap08.sec05.art03;

import chap08.sec05.art02.HankookTire;
import chap08.sec05.art02.Tire;

public class Car {
	Tire[] tires = { new HankookTire(), new HankookTire(), new HankookTire(), new HankookTire() };

	void run() {
		for (Tire tire : tires) {
			tire.roll();
		}
	}
}
