package chap15.sec04.art03;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		// Properties�� Hashtable�� ����Ŭ�����̱� ������ Hashtable�� ��� Ư¡�� �״�� ������ ����.
		// �������� Hashtable�� Ű�� ���� �پ��� Ÿ������ ������ ����������
		// Properties�� Ű�� ���� String Ÿ������ ������ �÷�����.
		Properties properties = new Properties();
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");
		properties.load(new FileReader(path));

		// properties���� Ű�� ���� ���� �ҷ���
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
