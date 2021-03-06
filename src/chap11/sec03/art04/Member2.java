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

		// 먼저 얕은 복사를 해서 name, age 를 복제한다.
		Member2 cloned = (Member2) super.clone();

		// scores를 깊은 복제한다.
		cloned.scores = Arrays.copyOf(scores, scores.length);

		// car를 깊은 복제한다.
		cloned.car = new Car(this.car.model);

		// 깊은 복제된 Member 객체를 리턴
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
