package chap12.sec03.art01;

// 스레드의 작업 우선순위
// MAX_PRIORITY와 숫자 10이 가장 먼저, MIN_PRIORITY와 1이 가장 나중에 작업한다
public class PriorityExample {
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			Thread thread = new CalcThread("thread"+i);
			if(i==5) {
				thread.setPriority(Thread.MAX_PRIORITY);
			}else if(i>=1&&i<=3) {
				thread.setPriority(8-i);
			}
			else {
				thread.setPriority(Thread.MIN_PRIORITY);
			}
			thread.start();
		}
	}
}
