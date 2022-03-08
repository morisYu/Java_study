package project01;

public class Score {
	String number;
	int kor;
	int eng;
	int mat;
	int sum;
	double avg;

	public Score(String number, int kor, int eng, int mat) {
		this.number = number;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.sum = kor + eng + mat;
		this.avg = (double) sum / 3.0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Score score = (Score) obj;
			if (this.number.equals(score.number)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return number.hashCode();
	}
}
