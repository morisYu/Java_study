package chap11.sec03.art03;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		String str = "문자열";

		System.out.println(obj1.toString());
		
		// Date 클래스는 toString() 메소드를 재정의해서 현재 시스템 날짜와 시간을 표시
		System.out.println(obj2.toString());
		
		// String 클래스는 toString() 메소드를 재정의해서 저장하고있는 문자열을 리턴
		System.out.println(str.toString());
	}
}
