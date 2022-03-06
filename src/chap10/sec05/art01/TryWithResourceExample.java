package chap10.sec05.art01;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new NullPointerException();
		} catch (NullPointerException e) {
			System.out.println("테스트 코드가 실행되었습니다.");
		} catch (Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
	}
}
