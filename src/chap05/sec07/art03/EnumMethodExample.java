package chap05.sec07.art03;
import chap05.sec07.art01.Week;

public class EnumMethodExample {
	public static void main(String[] args) {

		// name() 메소드
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);

		// ordinal() 메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal);

		// compareTo() 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);

		// valueOf() 메소드
		// 클래스 시작 시 문자를 받아야 실행이 됨(args에 data가 들어와야 함)
		// RUN Configuration 에서 값을 넣어줘야 함
		if (args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말 이군요");
			} else {
				System.out.println("평일 이군요");
			}
		}

		// values() 메소드
		Week[] days = Week.values();
		for (Week day : days) {
			System.out.println(day);
		}
	}
}
