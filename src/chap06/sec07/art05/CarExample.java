package chap06.sec07.art05;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1 company: " + car1.company);
		System.out.println();

		Car car2 = new Car("�ڰ���");
		System.out.println("car2 company: " + car2.company);
		System.out.println("car2 model: " + car2.model);
		System.out.println();

		Car car3 = new Car("�ڰ���", "����");
		System.out.println("car3 cmopany: " + car3.company);
		System.out.println("car3 model: " + car3.model);
		System.out.println("car3 color: " + car3.color);
		System.out.println();

		Car car4 = new Car("������", "����", 200);
		System.out.println("car4 cmopany: " + car4.company);
		System.out.println("car4 model: " + car4.model);
		System.out.println("car4 color: " + car4.color);
		System.out.println("car4 maxSpeed: " + car4.maxSpeed);
	}
}