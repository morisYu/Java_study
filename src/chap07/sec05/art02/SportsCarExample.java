package chap07.sec05.art02;

public class SportsCarExample {
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("속도: " + car.speed);

		car.speedUp();
		car.speedUp();
		car.speedUp();

		System.out.println("속도: " + car.speed);

		car.stop();

		System.out.println("속도: " + car.speed);
		
		SportsCar scar = new SportsCar();
		
		scar.speedUp();
		
		System.out.println("속도: "+scar.speed);
		
		
	}
}
