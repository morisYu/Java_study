package chap06.sec10.art05;

public class SingletonExample {
	public static void main(String[] args) {

//		Singleton obj = new Singleton();  // 싱글톤은 new 연산자로 생성자 호출 불가능

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		// singleton 객체를 불러와서 obj1, obj2 는 같은 객체 주소를 참조함
		System.out.println(obj1);
		System.out.println(obj2);

		if (obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}

	}
}
