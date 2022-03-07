package chap11.sec14.art02;

import java.util.TimeZone;

public class PrintTimeZoneID {
	public static void main(String[] args) {
		String[] availableIDS = TimeZone.getAvailableIDs();
		for (String id : availableIDS) {
			System.out.print(id);
			if (id.equals("Asia/Seoul")) {
				System.out.print("          <<<<< �ѱ� ����");
			}
			System.out.println();
		}
	}
}
