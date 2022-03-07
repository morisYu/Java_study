package chap11.sec03.art01;

import chap11.sec03.art02.Member2;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		}else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등합니다.");
		}else {
			System.out.println("obj1과 obj3은 동등하지 않습니다.");
		}
		
		System.out.println("----------------------");
		System.out.println("hashCode() 메소드를 재정의");
		// hashCode() 메소드 재정의
		Member2 obj4 = new Member2("blue");
		Member2 obj5 = new Member2("blue");
		Member2 obj6 = new Member2("red");
		
		System.out.println(obj4);
		System.out.println(obj5);
		System.out.println(obj6);
		
		if(obj4.equals(obj5)) {
			System.out.println("obj4과 obj5는 동등합니다.");
		}else {
			System.out.println("obj4과 obj5는 동등하지 않습니다.");
		}
		
		if(obj4.equals(obj6)) {
			System.out.println("obj4과 obj6은 동등합니다.");
		}else {
			System.out.println("obj4과 obj6은 동등하지 않습니다.");
		}
	}
}
