package chap08.sec05.art05;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();

		vehicle.run();
		// vehicle.checkFare(); // Vehicle �������̽����� �ش� �޼ҵ� ����

		Bus bus = (Bus) vehicle;

		bus.run();
		bus.checkFare();
	}
}
