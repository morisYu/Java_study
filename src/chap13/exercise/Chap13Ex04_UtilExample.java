package chap13.exercise;

public class Chap13Ex04_UtilExample {
	public static void main(String[] args) {
		Chap13Ex04_Pair<String, Integer> pair = new Chap13Ex04_Pair<> ("ȫ�浿", 35);
		Integer age = Chap13Ex04_Util.getValue(pair, "ȫ�浿");
		System.out.println(age);
		
		Chap13Ex04_ChildPair<String, Integer> childPair = new Chap13Ex04_ChildPair<>("ȫ���",20);
		Integer childAge = Chap13Ex04_Util.getValue(childPair, "ȫ���");
		System.out.println(childAge);
		
		// OtherPair �� Pair�� ������� �����Ƿ� ���ܰ� �߻��ؾ� ��.
//		Chap13Ex04_OtherPair<String, Integer> otherPair = new Chap13Ex04_OtherPair<>("ȫ���", 20);
//		int otherAge = Chap13Ex04_Util.getValue(otherPair, "ȫ���");
//		System.out.println(otherAge);
	}
}


