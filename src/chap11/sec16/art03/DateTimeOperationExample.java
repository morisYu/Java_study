package chap11.sec16.art03;

import java.time.LocalDateTime;

public class DateTimeOperationExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재시: " + now);

		// 각 메소드들은 도트(.) 연산자로 연결해서 순차적으로 호출 가능
		LocalDateTime targetDateTime = now.plusYears(1).minusMonths(2).plusDays(3).plusHours(4).minusMinutes(5)
				.plusSeconds(6);
		System.out.println("연산후: " + targetDateTime);
	}
}
