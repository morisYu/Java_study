package project01;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		HashMap<Student, Score> manage = new HashMap<Student, Score>();

		Admin admin = null;
		String Id;
		String Password;
		char check = '0';
		int whileCount = 0;
		int studentCount = 0;
		int systemNo=0;
		boolean run1 = true;
		boolean run2 = true;
		
		while(run1) {
			
			if (whileCount == 3) {
				System.out.println("���α׷��� ����˴ϴ�.");
				return;
			}

			System.out.println("Id�� �Է��ϼ���.");
			System.out.print("�Է�> ");
			Id = scanner.next();

			System.out.println("Password�� �Է��ϼ���.");
			System.out.print("�Է�> ");
			Password = scanner.next();

			check = Admin.adminCheck(Id, Password);
			switch (check) {
			case 'o':
				admin = Admin.getInstance();
				System.out.println(admin);
				System.out.println("���� ���� �ý���");
				run1=false;
				break;
			default:
				whileCount++;
				continue;
			}
		}

		while (run2) {

			System.out.println();
			System.out.println("----------------------------------------------");
			System.out.println("1.�л���� | 2. ����Ȯ�� | 3.�����м� | 4.������ | 5.����");
			System.out.println("----------------------------------------------");
			System.out.println("�Է�> ");

			systemNo = scanner.nextInt();

			if (systemNo == 1) {
				System.out.println("�л� ���� �Է��ϼ���");
				System.out.print("�Է�> ");
				studentCount = scanner.nextInt();

				for (int i = 0; i < studentCount; i++) {
					System.out.print("�й� �Է�> ");
					String number = scanner.next();
					System.out.print("�̸� �Է�> ");
					String name = scanner.next();
					System.out.print("���� ����> ");
					int kor = scanner.nextInt();
					System.out.print("���� ����> ");
					int eng = scanner.nextInt();
					System.out.print("���� ����> ");
					int mat = scanner.nextInt();
					manage.put(new Student(number, name), new Score(number, kor, eng, mat));

				}

			} else if (systemNo == 2) {
				System.out.println("number   name   kor   eng   mat   sum   avg");
				for (Student key : manage.keySet()) {
					System.out.printf("   %s    %s   %-3d    %-3d  %-3d   %-3d  %.2f\n",key.number,key.name,manage.get(key).kor,manage.get(key).eng,manage.get(key).mat,manage.get(key).sum,manage.get(key).avg);
				}
				
			}else if(systemNo ==3) {
				
				List<Map.Entry<Student, Score>> entryList = new LinkedList<>(manage.entrySet());
				entryList.sort(new Comparator<Map.Entry<Student, Score>>(){
					@Override
					public int compare(Map.Entry<Student, Score> o1, Map.Entry<Student, Score> o2) {
						return o1.getValue().sum - o2.getValue().sum;
					}
				});
				for(Map.Entry<Student, Score> entry : entryList) {
					System.out.println("�̸�: "+entry.getKey().name+", �����հ�: "+entry.getValue().sum);
				}
			}else if(systemNo ==4) {
				System.out.println("������ ���̵�, ��й�ȣ ����");
				System.out.print("�űԾ��̵� �Է�> ");
				String newId = scanner.next();
				System.out.print("�űԺ�й�ȣ �Է�> ");
				String newPass = scanner.next();
				
				admin.changeIdPassword(newId, newPass);
				
			}else if(systemNo ==5) {
				run2=false;
			}
		}
		System.out.println("���α׷� ����");
	}
}
