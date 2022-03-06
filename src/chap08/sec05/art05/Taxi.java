package chap08.sec05.art05;

public class Taxi implements Vehicle {

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}

	public void checkFare() {
		System.out.println("택시 승차요금을 체크합니다.");
	}

}
