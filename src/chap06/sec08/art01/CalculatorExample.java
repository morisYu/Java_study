package chap06.sec08.art01;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		boolean run = myCalc.power("on");
		while (run) {
			int result1 = myCalc.plus(5, 6);
			System.out.println("result1: " + result1);

			byte x = 10;
			byte y = 4;
			double result2 = myCalc.divide(x, y);
			System.out.println("result2: " + result2);

			myCalc.powerOff();
			run = myCalc.power("off");
		}

	}
}
