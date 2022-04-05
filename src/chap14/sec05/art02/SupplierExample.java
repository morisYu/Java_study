package chap14.sec05.art02;

import java.util.function.BooleanSupplier;
// Supplier 함수적 인터페이스의 특징은 매개 변수가 없고 리턴값이 있다.
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		// T 객체를 리턴
		Supplier<String> supplier = () -> {
			String str = "java hello";
			return str;
		};
		String str = supplier.get();
		System.out.println(str);
		
		// int 값을 리턴
		IntSupplier intSupplier = () -> {
			int num = (int) (Math.random()*6)+1;
			return num;
		};
		int num = intSupplier.getAsInt();
		System.out.println("눈의 수: "+num);
		
		// boolean 값을 리턴
		BooleanSupplier booleanSupplier = () -> {
			boolean b = true;
			return b;
		};
		boolean b = booleanSupplier.getAsBoolean();
		System.out.println(b);
	}
}
