package chap11.sec05.art04;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
	public static void main(String[] args) {

		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");

		System.out.println("운영체제 이름: " + osName);
		System.out.println("사용자 이름: " + userName);
		System.out.println("사용차 홈디렉토리: " + userHome);

		System.out.println("------------------------");
		System.out.println("[ key ] value");
		System.out.println("------------------------");
		Properties props = System.getProperties();
		@SuppressWarnings("rawtypes")
		Set keys = props.keySet();
		
		for (Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("[ key ] " + value);
		}
	}
}
