package chap11.sec12.art01;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		// Boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");
		Integer obj3 = Integer.valueOf("100");
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		System.out.println(System.identityHashCode(obj3));
		
		System.out.println();
		
		// UnBoxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();

		System.out.println(System.identityHashCode(value1));
		System.out.println(System.identityHashCode(value2));
		System.out.println(System.identityHashCode(value3));
		
		System.out.println();

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
}
