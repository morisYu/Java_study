package chap08.sec05.art05;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();

		vehicle.run();
		// vehicle.checkFare(); // Vehicle 인터페이스에는 해당 메소드 없음

		Bus bus = (Bus) vehicle;

		bus.run();
		bus.checkFare();
	}
}
