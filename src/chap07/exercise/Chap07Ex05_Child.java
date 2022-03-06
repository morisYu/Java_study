package chap07.exercise;

public class Chap07Ex05_Child extends Chap07Ex05_Parent {
	@SuppressWarnings("unused")
	private int studentNo;

	/*
	 * 상속받았을 경우에 부모클래스에 생성자가 있다면 자식클래스에서 super 메소드로 부모객체를 호출해야함 public
	 * Chap07Ex05_Child(String name, int studentNo) {
	 * 
	 * this.name = name; this.studentNo = studentNo; }
	 */

	public Chap07Ex05_Child(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}
}
