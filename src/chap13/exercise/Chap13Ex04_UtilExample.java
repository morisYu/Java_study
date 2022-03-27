package chap13.exercise;

public class Chap13Ex04_UtilExample {
	public static void main(String[] args) {
		Chap13Ex04_Pair<String, Integer> pair = new Chap13Ex04_Pair<> ("È«±æµ¿", 35);
		Integer age = Chap13Ex04_Util.getValue(pair, "È«±æµ¿");
		System.out.println(age);
		
		Chap13Ex04_ChildPair<String, Integer> childPair = new Chap13Ex04_ChildPair<>("È«»ï¿ø",20);
		Integer childAge = Chap13Ex04_Util.getValue(childPair, "È«»ï¼ø");
		System.out.println(childAge);
		
		// OtherPair ´Â Pair¸¦ »ó¼ÓÇÏÁö ¾ÊÀ¸¹Ç·Î ¿¹¿Ü°¡ ¹ß»ýÇØ¾ß ÇÔ.
//		Chap13Ex04_OtherPair<String, Integer> otherPair = new Chap13Ex04_OtherPair<>("È«»ï¿ø", 20);
//		int otherAge = Chap13Ex04_Util.getValue(otherPair, "È«»ï¿ø");
//		System.out.println(otherAge);
	}
}


