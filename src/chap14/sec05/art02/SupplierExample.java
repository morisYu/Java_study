package chap14.sec05.art02;

import java.util.function.BooleanSupplier;
// Supplier �Լ��� �������̽��� Ư¡�� �Ű� ������ ���� ���ϰ��� �ִ�.
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		// T ��ü�� ����
		Supplier<String> supplier = () -> {
			String str = "java hello";
			return str;
		};
		String str = supplier.get();
		System.out.println(str);
		
		// int ���� ����
		IntSupplier intSupplier = () -> {
			int num = (int) (Math.random()*6)+1;
			return num;
		};
		int num = intSupplier.getAsInt();
		System.out.println("���� ��: "+num);
		
		// boolean ���� ����
		BooleanSupplier booleanSupplier = () -> {
			boolean b = true;
			return b;
		};
		boolean b = booleanSupplier.getAsBoolean();
		System.out.println(b);
	}
}
