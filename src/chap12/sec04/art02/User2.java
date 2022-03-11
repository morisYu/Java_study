package chap12.sec04.art02;

public class User2 extends Thread {
	private Calculator2 calculator;

	public void setCalculator(Calculator2 calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.print();
		calculator.setMemory(50);
	}
}
