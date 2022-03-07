package chap11.sec07.art02;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("신민철");
		String strVar2 = "신민철";
		
		// 두 String 객체는 다른 주소값을 가지지만 내용이 같으면 hashCode 는 같게 나옴
		System.out.println(strVar1.hashCode());
		System.out.println(strVar2.hashCode());
		
		// identityHashCode() 메소드로 String 객체 주소 확인
		System.out.println(System.identityHashCode(strVar1));
		System.out.println(System.identityHashCode(strVar2));
		
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1 과 strVar2는 같은 객체를 참조");
		}else {
			System.out.println("다른 객체를 참조");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1 과 strVar2는 같은 문자열를 가짐");
		}else {
			System.out.println("다른 문자열을 가짐");
		}
	}
}
