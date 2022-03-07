package chap11.sec07.art02;

public class StringToLowerUppweCaseExample {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";

		System.out.println(str1.equals(str2));

		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();

		System.out.println(lowerStr1.equals(lowerStr2));

		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println("소문자로 출력");
		System.out.println(lowerStr1);
		System.out.println(lowerStr2);
		
		System.out.println("대문자로 출력");
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toUpperCase());

	}
}
