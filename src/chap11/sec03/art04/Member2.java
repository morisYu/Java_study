package chap11.sec03.art04;

import java.util.Arrays;

public class Member2 implements Cloneable {
	public String name;
	public int age;
	public int[] scores;
	public Car car;

	public Member2(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		// ���� ���� ���縦 �ؼ� name, age �� �����Ѵ�.
		Member2 cloned = (Member2) super.clone();

		// scores�� ���� �����Ѵ�.
		cloned.scores = Arrays.copyOf(scores, scores.length);

		// car�� ���� �����Ѵ�.
		cloned.car = new Car(this.car.model);

		// ���� ������ Member ��ü�� ����
		return cloned;

	}

	public Member2 getMember() {
		Member2 cloned = null;

		try {
			cloned = (Member2) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}