package chap15.exercise;

import java.util.List;

public class Chap15Ex07_ListExample {
	public static void main(String[] args) {
		Chap15Ex07_BoardDao dao = new Chap15Ex07_BoardDao();

		List<Chap15Ex07_Board> list = dao.getBoardList();
		for (Chap15Ex07_Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}
}
