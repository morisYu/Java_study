package chap11.exercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Chap11Ex13_DatePrintExample {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat simple = new SimpleDateFormat("yyyy�� MM�� dd�� E���� a hh�� mm��");
		System.out.println(simple.format(now));
	}
}
