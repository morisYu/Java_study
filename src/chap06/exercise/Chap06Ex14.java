package chap06.exercise;

public class Chap06Ex14 {
	public static void main(String[] args) {
		Chap06Ex13[] member = new Chap06Ex13[2];
		member[0] = new Chap06Ex13("ȫ�浿", "hong", "1234", 23);
		member[1] = new Chap06Ex13("���ڹ�", "java");
		System.out.println(member[0].name);
		System.out.println(member[0].id);
		System.out.println(member[0].password);
		System.out.println(member[0].age);
		System.out.println("-----------------");
		System.out.println(member[1].name);
		System.out.println(member[1].id);
		System.out.println(member[1].password);
		System.out.println(member[1].age);
	}
}
