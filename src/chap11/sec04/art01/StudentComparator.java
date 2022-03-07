package chap11.sec04.art01;

import java.util.Comparator;

class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b) {
		if(a.sno<b.sno) {
			return -1;
		}else if(a.sno==b.sno) {
			return 0;
		}else {
			return 1;
		}
	}
}

class Student {
	int sno;

	Student(int sno) {
		this.sno = sno;
	}
}
