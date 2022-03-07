package chap11.sec05.art02;

public class GcExample {
	public static void main(String[] args) {
		Employee emp;
		emp = new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = new Employee(3);

		System.out.println("emp�� ���������� �����ϴ� �����ȣ: " + emp.eno);
		System.gc();
	}
}

class Employee {
	public int eno;

	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee(" + eno + ") �� �޸𸮿� ������");
	}

	public void finalize() {
		System.out.println("Employee(" + eno + ") �� �޸𸮿��� ���ŵ�");
	}
}