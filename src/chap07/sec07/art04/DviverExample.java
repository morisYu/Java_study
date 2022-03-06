package chap07.sec07.art04;

public class DviverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle vehicle = new Vehicle();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		vehicle.run();
		driver.drive(vehicle);
		driver.drive(bus);
		driver.drive(taxi);
	}
}
