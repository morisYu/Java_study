package chap12.sec02.art02;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		Thread thrad = new BeepThread();
		thrad.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("¶ò");
			try {
				Thread.sleep(500);

			} catch (Exception e) {

			}
		}
	}
}
