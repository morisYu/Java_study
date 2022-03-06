package chap07.exercise;

public class Chap07Ex06_Parent {
	public String nation;
	
	public Chap07Ex06_Parent() {
		this("¥Î«—πŒ±π");
		System.out.println("Parent() call");
	}
	
	public Chap07Ex06_Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
