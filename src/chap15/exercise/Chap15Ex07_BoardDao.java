package chap15.exercise;

import java.util.ArrayList;
import java.util.List;

public class Chap15Ex07_BoardDao {
	List<Chap15Ex07_Board> list = new ArrayList<Chap15Ex07_Board>();
	
	public Chap15Ex07_BoardDao() {
		list.add(new Chap15Ex07_Board("����1", "����1"));
		list.add(new Chap15Ex07_Board("����2", "����2"));
		list.add(new Chap15Ex07_Board("����3", "����3"));
	}

	public List<Chap15Ex07_Board> getBoardList() {
		return list;
	}
}
