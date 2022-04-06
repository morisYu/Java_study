package chap14.sec05.art08;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {
	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;

		// minBy() 정적메소드를 사용해서 둘 중 작은 값을 리턴
		binaryOperator = BinaryOperator.minBy((f1, f2) -> Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
		System.out.println(fruit.name);

		// maxBy() 정적메소드를 사용해서 둘 중 큰 값을 리턴
		binaryOperator = BinaryOperator.maxBy((f1, f2) -> Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
		System.out.println(fruit.name);
	}
}

class Fruit {
	public String name;
	public int price;

	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
