package chap12.sec04.art02;

public class User1 extends Thread {
	private Calculator2 calculator;

	public void setCalculator(Calculator2 calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.print();
		calculator.setMemory(100);
	}
}
