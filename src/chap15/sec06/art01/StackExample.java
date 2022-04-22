package chap15.sec06.art01;

import java.util.Stack;

// Stack�� LIFO(Last In First Out) �ڷᱸ���� ������ Ŭ�����̴�.
public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		// ���� ����
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		// ���� �������� ���� �������� ����
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("������ ����: "+coin.getValue()+" ��");
		}
	}
}