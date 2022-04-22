package chap15.sec06.art01;

import java.util.Stack;

// Stack은 LIFO(Last In First Out) 자료구조를 구현한 클래스이다.
public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		// 넣은 순서
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		// 가장 마지막에 넣은 동전부터 꺼냄
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전: "+coin.getValue()+" 원");
		}
	}
}
