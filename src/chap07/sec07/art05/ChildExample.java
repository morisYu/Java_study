package chap07.sec07.art05;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		// child에 있는 멤버 사용 불가
		//parent.field2 = "data2";
		//parent.method3();
		
		Child child = (Child) parent;
		child.field2 = "yyy";
		child.method3();
	}
}
