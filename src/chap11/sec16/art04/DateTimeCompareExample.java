package chap11.sec16.art04;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
	public static void main(String[] args) {
		LocalDateTime startDateTime = LocalDateTime.of(2023, 1, 1, 9, 0, 0);
		System.out.println("������: " + startDateTime);

		LocalDateTime endDateTime = LocalDateTime.of(2024, 3, 31, 18, 0, 0);
		System.out.println("������: " + endDateTime);

		if (startDateTime.isBefore(endDateTime)) {
			System.out.println("���� ���Դϴ�.");
		} else if (startDateTime.isEqual(endDateTime)) {
			System.out.println("�����մϴ�.");
		} else if (startDateTime.isAfter(endDateTime)) {
			System.out.println("�����߽��ϴ�.");
		}
		System.out.println();

		System.out.println("[������� ���� �ð�]");
		System.out.println("---------------------------");
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);

		remainYear = ChronoUnit.YEARS.between(startDateTime, endDateTime);
		remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
		remainDay = ChronoUnit.DAYS.between(startDateTime, endDateTime);
		remainHour = ChronoUnit.HOURS.between(startDateTime, endDateTime);
		remainMinute = ChronoUnit.MINUTES.between(startDateTime, endDateTime);
		remainSecond = ChronoUnit.SECONDS.between(startDateTime, endDateTime);

		System.out.println("���� ��: " + remainYear);
		System.out.println("���� ��: " + remainMonth);
		System.out.println("���� ��: " + remainDay);
		System.out.println("���� �ð�: " + remainHour);
		System.out.println("���� ��: " + remainMinute);
		System.out.println("���� ��: " + remainSecond);
		System.out.println();

		System.out.println("[������� ���� �Ⱓ]");
		System.out.println("---------------------------");
		Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
		System.out.print("���� �Ⱓ: " + period.getYears() + "�� ");
		System.out.print(period.getMonths() + "�� ");
		System.out.println(period.getDays() + "��");

		Duration duration = Duration.between(startDateTime.toLocalTime(), endDateTime.toLocalTime());
		System.out.println("���� ��: " + duration.getSeconds());

	}
}
