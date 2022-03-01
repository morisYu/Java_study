package chap05.sec06.art06;

/*String[] args 설명
main 메소드 실행 시 argument가 2 개 들어와야 실행이 됨(예시)
jre 실행할 때 argument를 넣어줌
여기서 실핼할 때는 "Run" -> "Run Configurations" -> "Arguments" -> "Program arguments" 에서 숫자(문자) 2개를 
넣고 "Run" 해야함
*/
public class MainStringArrayArgument {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("프로그램의 사용법");
			System.out.println("Java MainStringArrayArgument num1 num2");
			System.exit(0);
		}
		String strNum1 = args[0];
		String strNum2 = args[1];

		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}
