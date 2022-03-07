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

			sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
			System.out.println(sdf.format(now));

			sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
			System.out.println(sdf.format(now));

			sdf = new SimpleDateFormat("������ E����");
			System.out.println(sdf.format(now));

			sdf = new SimpleDateFormat("������ D��° ��");
			System.out.println(sdf.format(now));

			sdf = new SimpleDateFormat("�̴��� d���� ��");
			System.out.println(sdf.format(now));
			
			if (now.getMinutes() == 35) {
				break;
			}
			Thread.sleep(3000);
		}
	}
}
