package chap11.exercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Chap11Ex13_DatePrintExample {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분");
		System.out.println(simple.format(now));
	}
}
