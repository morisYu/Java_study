package chap13.sec03;

// ��Ƽ Ÿ�� �Ķ����
// ���׸� Ÿ���� �� �� �̻��� ��Ƽ Ÿ�� �Ķ���͸� ����� �� �ִ�.
public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("����Ʈ Tv");
		Tv tv = product1.getKind();
		tv.setBrand("�Ｚ");
		String tvModel = product1.getModel();
		System.out.println(tv.brand+" �� "+tvModel);
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("����");
		Car car = product2.getKind();
		car.setBrand("����");
		String carModel = product2.getModel();
		System.out.println(car.brand+" �� "+carModel);
	}
}
