package chap14.sec05.art01;

// 자바8부터는 빈번하게 사용되는 함수적 인터페이스를 API 패키지로 제공한다.
// 함수적 인터페이스는 크게 Consumer, Supplier, Function, Operator, Predicate로 구분된다.
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		// 객체 T를 받아서 소비
		Consumer<String> consumer = t -> System.out.println(t+"8");
		consumer.accept("java");
		
		// 객체 T와 U를 받아서 소비
		BiConsumer<String, String> bigConsumer = (t, u) -> System.out.println(t+u);
		bigConsumer.accept("java", "8");
		
		// double 값을 받아서 소비
		DoubleConsumer doubleConsumer = d -> System.out.println("java"+d);
		doubleConsumer.accept(8);
		
		// 객체 T와 int 값을 받아서 소비
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t+i);
		objIntConsumer.accept("java", 8);
	}
}
