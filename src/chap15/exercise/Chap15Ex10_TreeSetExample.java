package chap15.exercise;

import java.util.TreeSet;

public class Chap15Ex10_TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Chap15Ex10_Student> treeSet = new TreeSet<Chap15Ex10_Student>();

		treeSet.add(new Chap15Ex10_Student("blue", 96));
		treeSet.add(new Chap15Ex10_Student("hong", 86));
		treeSet.add(new Chap15Ex10_Student("white", 92));

		// last() 메소드를 이용해서 제일 높은 객체를 가지고올 수 있게
		// Chap15Ex10_Student 클래스에서 compareTo() 메소드 오버라이딩
		Chap15Ex10_Student student = treeSet.last();
		System.out.println("최고점수: " + student.score);
		System.out.println("최고점수를 받은 아이디: " + student.id);

	}
}
