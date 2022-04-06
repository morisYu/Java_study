package chap14.sec05.art08;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {
	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;

		// minBy() �����޼ҵ带 ����ؼ� �� �� ���� ���� ����
		binaryOperator = BinaryOperator.minBy((f1, f2) -> Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("����", 6000), new Fruit("����", 10000));
		System.out.println(fruit.name);

		// maxBy() �����޼ҵ带 ����ؼ� �� �� ū ���� ����
		binaryOperator = BinaryOperator.maxBy((f1, f2) -> Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("����", 6000), new Fruit("����", 10000));
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
