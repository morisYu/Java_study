package chap15.sec02.art02;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		// ArrayList�� �ٸ� ���� Vector�� ����ȭ�� �޼ҵ�� �����Ǿ� �ֱ� ������
		// ��Ƽ �����尡 ���ÿ� �� �޼ҵ���� ������ �� ����, �ϳ��� �����尡 ������ �Ϸ��ؾ߸�
		// �ٸ� �����带 ������ �� �ִ�.
		// ���� ��Ƽ ������ ȯ�濡�� �����ϰ� ��ü�� �߰�, ������ �� �ִ�.(Thread Safe)
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("����1","����1", "�۾���1"));
		list.add(new Board("����2","����2", "�۾���2"));
		list.add(new Board("����3","����3", "�۾���3"));
		list.add(new Board("����4","����4", "�۾���4"));
		list.add(new Board("����5","����5", "�۾���5"));
		
		list.remove(2);
		list.remove(3);
		
		for(int i=0;i<list.size();i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}
}
