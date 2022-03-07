package chap11.sec06.art02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("chap11.sec06.art02.Car");

		System.out.println("[클래스 이름]");
		System.out.println(clazz.getName());
		System.out.println();

		System.out.println("[생성자 정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}

		System.out.println();

		System.out.println("[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		System.out.println();

		System.out.println("[메소드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		
		System.out.println();
		
		System.out.println("----------------------------");
		System.out.println("[상속받았을 때 객체의 필드, 메소드 정보]");
		System.out.println("----------------------------");
		
		System.out.println("[상속 전체 필드 정보]");
		// getFields() 메소드는 상속받은 필드정보도 가지고 옴(public 접근제한자만)
		Field[] inheritanceFields = clazz.getFields();
		for (Field field : inheritanceFields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		System.out.println();

		System.out.println("[상속 전체 메소드 정보]");
		// getMethods() 메소드는 상속받은 메소드정보도 가조고 옴(public 접근제한자만)
		Method[] inheritanceMethods = clazz.getMethods();
		for (Method method : inheritanceMethods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}

	}

	@SuppressWarnings("rawtypes")
	private static void printParameters(Class[] parameters) {
		for (int i = 0; i < parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if (i < (parameters.length - 1)) {
				System.out.print(",");
			}
		}
	}
}

class Car extends Vehicle {
	static String name;
	public String ssn;
	public int carAge;

	public Car(String name) {
		super(model, brand);
	}

	public Car(String name, String ssn, int age) {
		super();
	}

	void getMethod1(int age) {

	}

	String setMethod1(String name, String ssn) {
		return name + ssn;
	}
}

class Vehicle {
	static String model;
	static String brand;
	public int vehicleAge;

	public Vehicle() {

	}

	public Vehicle(String model, String brand) {
		Vehicle.model = model;
		Vehicle.brand = brand;
	}

	public void setModel(String model) {
		Vehicle.model = model;
	}

	void getModel(String model) {
		Vehicle.model = model;
	}
}
