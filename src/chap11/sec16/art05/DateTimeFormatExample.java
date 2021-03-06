package chap11.sec16.art05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분 s초");

		String nowString = now.format(dateTimeFormatter);
		System.out.println(nowString);
	}
}
