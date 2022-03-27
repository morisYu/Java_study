package chap13.exercise;

public class Chap13Ex04_Util {
	// 规过1.
	public static <K, V> V getValue(Chap13Ex04_Pair<K, V> pair, K k) {
		if(pair.getKey().equals(k)) {
			return pair.getValue();
		}else {
			return null;
		}
	}
	
	// 规过2.
	public static <P extends Chap13Ex04_Pair<K, V>, K, V> V getValue2(P p, K k) {
		if(p.getKey().equals(k)) {
			return p.getValue();
		}else {
			return null;
		}
	}
}
