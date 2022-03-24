package chap13.sec03;

// 멀티 타입 파라미터
// 제네릭 타입은 두 개 이상의 멀티 타입 파라미터를 사용할 수 있다.
public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("스마트 Tv");
		Tv tv = product1.getKind();
		tv.setBrand("삼성");
		String tvModel = product1.getModel();
		System.out.println(tv.brand+" 의 "+tvModel);
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		car.setBrand("포드");
		String carModel = product2.getModel();
		System.out.println(car.brand+" 의 "+carModel);
	}
}
