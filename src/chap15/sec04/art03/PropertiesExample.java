package chap15.sec04.art03;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		// Properties는 Hashtable의 하위클래스이기 때문에 Hashtable의 모든 특징을 그대로 가지고 있음.
		// 차이점은 Hashtable은 키와 값을 다양한 타입으로 지정이 가능하지만
		// Properties는 키와 값을 String 타입으로 제한한 컬렉션임.
		Properties properties = new Properties();
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");
		properties.load(new FileReader(path));

		// properties에서 키에 따른 값을 불러옴
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String test = properties.getProperty("test");
		String contry = properties.getProperty("contry");
		String language = properties.getProperty("language");

		System.out.println("driver: " + driver);
		System.out.println("url: " + url);
		System.out.println("username: " + username);
		System.out.println("password: " + password);
		System.out.println("test: " + test);
		System.out.println("contry: " + contry);
		System.out.println("language: " + language);
	}
}
