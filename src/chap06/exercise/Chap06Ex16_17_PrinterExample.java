package chap06.exercise;

public class Chap06Ex16_17_PrinterExample {
	public static void main(String[] args) {
		// Ex16. ��ü �����ؼ� Printer Ŭ���� ���
		Chap06Ex16_17_Printer printer = new Chap06Ex16_17_Printer();
		printer.println16(10);
		printer.println16(true);
		printer.println16(5.7);
		printer.println16("ȫ�浿");

		// Ex17. ��ü ���� ���� Printer Ŭ���� ���(���� ���)
		// Ŭ�������� ���(�޼ҵ�) �ҷ����� ��
		Chap06Ex16_17_Printer.println17(10);
		Chap06Ex16_17_Printer.println17(true);
		Chap06Ex16_17_Printer.println17(5.7);
		Chap06Ex16_17_Printer.println17("ȫ�浿");

	}
}
