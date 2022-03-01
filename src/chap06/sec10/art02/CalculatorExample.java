package chap06.sec10.art02;

public class CalculatorExample {
	public static void main(String[] args) {

		// static 으로 정적 필드, 정적 메소드를 만들면 객체 생성 없이 사용 가능
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);

		System.out.println("result1= " + result1);
		System.out.println("result2= " + result2);
		System.out.println("result3= " + result3);
	}
}
