package chap06.exercise;

public class Chap06Ex16_17_PrinterExample {
	public static void main(String[] args) {
		// Ex16. 객체 생성해서 Printer 클래스 사용
		Chap06Ex16_17_Printer printer = new Chap06Ex16_17_Printer();
		printer.println16(10);
		printer.println16(true);
		printer.println16(5.7);
		printer.println16("홍길동");

		// Ex17. 객체 생성 없이 Printer 클래스 사용(정적 멤버)
		// 클래스에서 멤버(메소드) 불러오면 됨
		Chap06Ex16_17_Printer.println17(10);
		Chap06Ex16_17_Printer.println17(true);
		Chap06Ex16_17_Printer.println17(5.7);
		Chap06Ex16_17_Printer.println17("홍길동");

	}
}
