package chap06.sec10.art05;

public class SingletonExample {
	public static void main(String[] args) {

//		Singleton obj = new Singleton();  // �̱����� new �����ڷ� ������ ȣ�� �Ұ���

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		// singleton ��ü�� �ҷ��ͼ� obj1, obj2 �� ���� ��ü �ּҸ� ������
		System.out.println(obj1);
		System.out.println(obj2);

		if (obj1 == obj2) {
			System.out.println("���� Singleton ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
		}

	}
}
