package chap14.sec05.art01;

// �ڹ�8���ʹ� ����ϰ� ���Ǵ� �Լ��� �������̽��� API ��Ű���� �����Ѵ�.
// �Լ��� �������̽��� ũ�� Consumer, Supplier, Function, Operator, Predicate�� ���еȴ�.
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		// ��ü T�� �޾Ƽ� �Һ�
		Consumer<String> consumer = t -> System.out.println(t+"8");
		consumer.accept("java");
		
		// ��ü T�� U�� �޾Ƽ� �Һ�
		BiConsumer<String, String> bigConsumer = (t, u) -> System.out.println(t+u);
		bigConsumer.accept("java", "8");
		
		// double ���� �޾Ƽ� �Һ�
		DoubleConsumer doubleConsumer = d -> System.out.println("java"+d);
		doubleConsumer.accept(8);
		
		// ��ü T�� int ���� �޾Ƽ� �Һ�
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t+i);
		objIntConsumer.accept("java", 8);
	}
}
