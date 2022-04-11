package chap15.sec02.art01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		// ArrayList 객체는 배열과 다르게 저장되는 객체 수가 늘어나면 용량이 자동으로 증가함.
		List<String> list = new ArrayList<String>();
		
		// String 객체를 저장
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");
		list.add("iBATIS");
		
		// 저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체수: "+size);
		System.out.println();
		
		// 2번 인덱스의 객체 얻기
		String skill = list.get(2);
		System.out.println("2: "+skill);
		System.out.println();
		
		// 저장된 총 객체 수만큼 루핑
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i+": "+str);
		}
		System.out.println();
		
		// 2번 인덱스 객체(Database) 삭제
		list.remove(2);
		
		// 위에서 삭제 후 앞으로 당겨진 2번 인덱스 객체(Servlet/JSP) 삭제
		list.remove(2);
		
		// "iBATIS" 객체 삭제
		list.remove("iBATIS");
		
		System.out.println("남은 객체 출력");
		int x = 0;
		for(String str : list) {
			System.out.println(x+": "+str);
			x++;
		}
	}
}
