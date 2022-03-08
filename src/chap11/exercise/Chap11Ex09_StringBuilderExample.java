package chap11.exercise;

public class Chap11Ex09_StringBuilderExample {
	public static void main(String[] args) {
		
		// String ���ڿ��� �����ϸ� ���ο� ��ü�� ��� ����
		System.out.println("���ڿ� ����");
		System.out.println("---------------------------");
		String str = "";
		for (int i = 1; i <= 5; i++) {
			str += i;
			System.out.println("hashCode: " + System.identityHashCode(str));
		}
		System.out.println(str);
		System.out.println();

		// StringBuilder �� ����ϸ� ���ʿ��� ��ü�� �������� ����
		System.out.println("StringBuilder ���");
		System.out.println("---------------------------");
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= 5; i++) {
			sb.append(i);
			System.out.println("hashCode: " + System.identityHashCode(sb));
		}

		System.out.println(sb);
	}
}
