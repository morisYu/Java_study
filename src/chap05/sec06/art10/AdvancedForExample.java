package chap05.sec06.art10;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };

		int sum = 0;
		// 향상된 for문에서는 배열의 길이만큼 배열안에 있는 값을 순서대로 불러옴
		for (int score : scores) {
			sum += score;
		}
		System.out.println("점수 총합 = " + sum);
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);

		// 배열안에 있는 값은 다른 타입도 올 수 있음
		String stf = new String(); //string 타입의 변수 초기값을 null로 하기 위해서는 new로 만들어야함
		String[] str = { "Java ", "is ", "good" };
		for (String st : str) {
			stf += st;
		}
		System.out.println(stf);
	}
}
