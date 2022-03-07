package chap11.sec03.art05;

public class FinalizeExample {
	public static void main(String[] args) {
		Counter counter = null;

		for (int i = 0; i <= 50; i++) {
			counter = new Counter(i);
			System.out.println(counter.hashCode() + " 번 객체 생성");
			// counter 객체를 쓰레기로 만듦
			counter = null;

			// 쓰레기 수집기(garbage collector) 실행을 요청
			System.gc();
		}
	}
}
