package chap08.exercise;

public class Chap08Ex05_ActionExample {
	public static void main(String[] args) {
		
		// 익명 구현 객체 생성
		Chap08Ex05_Action action = new Chap08Ex05_Action() {

			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
			
		};
		
		action.work();
	}
}
