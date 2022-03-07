package chap11.sec15.art02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		while (true) {
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println(sdf.format(now));

			sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
			System.out.println(sdf.format(now));

			sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
			System.out.println(sdf.format(now));

			sdf = new SimpleDateFormat("오늘은 E요일");
			System.out.println(sdf.format(now));

			sdf = new SimpleDateFormat("올해의 D번째 날");
			System.out.println(sdf.format(now));

			sdf = new SimpleDateFormat("이달의 d번쨰 날");
			System.out.println(sdf.format(now));
			
			if (now.getMinutes() == 35) {
				break;
			}
			Thread.sleep(3000);
		}
	}
}
