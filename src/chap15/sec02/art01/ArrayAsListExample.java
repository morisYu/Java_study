package chap15.sec02.art01;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {
	public static void main(String[] args) {
		// ������ ��ü��� ������ List ���� �� asList() �޼ҵ� ���
		List<String> list1 = Arrays.asList("ȫ�浿", "�ſ��", "���ڹ�");
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
		students[0] = new Student("ȫ�浿", 18);
		students[1] = new Student("�ſ��", 19);
		students[2] = new Student("���ڹ�", 17);
		List<Student> std = Arrays.asList(students);
		for(Student student : std) {
			System.out.println("�̸�: "+student.getName()+" / ����: "+student.getAge());
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