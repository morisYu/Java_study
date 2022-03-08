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
				System.out.println("프로그램이 종료됩니다.");
				return;
			}

			System.out.println("Id를 입력하세요.");
			System.out.print("입력> ");
			Id = scanner.next();

			System.out.println("Password를 입력하세요.");
			System.out.print("입력> ");
			Password = scanner.next();

			check = Admin.adminCheck(Id, Password);
			switch (check) {
			case 'o':
				admin = Admin.getInstance();
				System.out.println(admin);
				System.out.println("성적 관리 시스템");
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
			System.out.println("1.학생등록 | 2. 성적확인 | 3.성적분석 | 4.관리자 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.println("입력> ");

			systemNo = scanner.nextInt();

			if (systemNo == 1) {
				System.out.println("학생 수를 입력하세요");
				System.out.print("입력> ");
				studentCount = scanner.nextInt();

				for (int i = 0; i < studentCount; i++) {
					System.out.print("학번 입력> ");
					String number = scanner.next();
					System.out.print("이름 입력> ");
					String name = scanner.next();
					System.out.print("국어 점수> ");
					int kor = scanner.nextInt();
					System.out.print("영어 점수> ");
					int eng = scanner.nextInt();
					System.out.print("수학 점수> ");
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
					System.out.println("이름: "+entry.getKey().name+", 점수합계: "+entry.getValue().sum);
				}
			}else if(systemNo ==4) {
				System.out.println("관리자 아이디, 비밀번호 변경");
				System.out.print("신규아이디 입력> ");
				String newId = scanner.next();
				System.out.print("신규비밀번호 입력> ");
				String newPass = scanner.next();
				
				admin.changeIdPassword(newId, newPass);
				
			}else if(systemNo ==5) {
				run2=false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
