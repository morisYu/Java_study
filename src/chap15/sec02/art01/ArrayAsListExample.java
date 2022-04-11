package chap15.sec02.art01;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {
	public static void main(String[] args) {
		// 고정된 객체들로 구성된 List 생성 시 asList() 메소드 사용
		List<String> list1 = Arrays.asList("홍길동", "신용권", "김자바");
		for(String name : list1) {
			System.out.println(name);
		}
		System.out.println();
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int value : list2) {
			System.out.println(value);
		}
		System.out.println();
		
		Student[] students = new Student[3];
		students[0] = new Student("홍길동", 18);
		students[1] = new Student("신용권", 19);
		students[2] = new Student("김자바", 17);
		List<Student> std = Arrays.asList(students);
		for(Student student : std) {
			System.out.println("이름: "+student.getName()+" / 나이: "+student.getAge());
		}
	}
}

class Student{
	public String name;
	public int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}