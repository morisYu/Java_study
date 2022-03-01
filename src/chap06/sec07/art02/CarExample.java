package chap06.sec07.art02;

// 생성자를 호출해서 객체 생성

public class CarExample {

	public static void main(String[] args) {
		Car myCar1 = new Car("검정", 3000);
		Car myCar2 = new Car(); 
		System.out.println(myCar1);
		System.out.println(myCar2);
	}
}
