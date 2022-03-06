package chap09.exercise;

public class Chap09Ex04_NestedClassExample {
	public static void main(String[] args) {
		Chap09Ex04_Car myCar = new Chap09Ex04_Car();

		Chap09Ex04_Car.Tire tire = myCar.new Tire();
		Chap09Ex04_Car.Engine engine = new Chap09Ex04_Car.Engine();

		tire.method();
		engine.method();
	}
}
