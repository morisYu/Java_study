package chap14.sec06.art03;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {
	public static void main(String[] args) {
		Function<String, Member> function1 = Member::new;
		Member member1 = function1.apply("angel");
		System.out.println("id: "+member1.getId()+" name: "+member1.getName());

		BiFunction<String, String, Member> function2 = Member::new;
		Member member2 = function2.apply("Ω≈√µªÁ", "angel");
		System.out.println("id: "+member2.getId()+" name: "+member2.getName());
	}
}
