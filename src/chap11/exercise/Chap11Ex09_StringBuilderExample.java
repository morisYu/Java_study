package chap11.exercise;

public class Chap11Ex09_StringBuilderExample {
	public static void main(String[] args) {
		
		// String 문자열을 수정하면 새로운 객체가 계속 생김
		System.out.println("문자열 수정");
		System.out.println("---------------------------");
		String str = "";
		for (int i = 1; i <= 5; i++) {
			str += i;
			System.out.println("hashCode: " + System.identityHashCode(str));
		}
		System.out.println(str);
		System.out.println();

		// StringBuilder 를 사용하면 불필요한 객체가 생성되지 않음
		System.out.println("StringBuilder 사용");
		System.out.println("---------------------------");
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= 5; i++) {
			sb.append(i);
			System.out.println("hashCode: " + System.identityHashCode(sb));
		}

		System.out.println(sb);
	}
}
