package chap06.exercise;

// �̱��� ��ü ����
public class Chap06Ex18_ShopServiceExample {
	public static void main(String[] args) {
		Chap06Ex18_ShopService obj1 = Chap06Ex18_ShopService.getInstance();
		Chap06Ex18_ShopService obj2 = Chap06Ex18_ShopService.getInstance();

		System.out.println(obj1);
		System.out.println(obj2);

		if (obj1 == obj2) {
			System.out.println("���� ShopService ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� ShopService ��ü�Դϴ�.");
		}
	}
}
