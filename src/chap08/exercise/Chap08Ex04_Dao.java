package chap08.exercise;

public class Chap08Ex04_Dao implements Chap08Ex04_DataAccessObject {

	private String str;

	public Chap08Ex04_Dao(String str) {
		this.str = str;
	}

	@Override
	public void selet() {
		System.out.println(str + " DB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println(str + " DB에 삽입");
	}

	@Override
	public void update() {
		System.out.println(str + " DB를 수정");
	}

	@Override
	public void delete() {
		System.out.println(str + " DB에서 삭제");
	}

}
