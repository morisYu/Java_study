package chap10.sec08.art01;

import chap10.sec07.art01.BalanceInsufficientException;
import chap10.sec07.art02.Account;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		// �����ϱ�
		account.deposit(10000);
		
		System.out.println("���ݾ�: "+account.getBalance());
		
		// ����ϱ�
		try {
			account.withdraw(30000);
		}catch(BalanceInsufficientException e) {
			String message = e.getMessage();  // ���� �޼��� ���
			System.out.println(message);
			System.out.println();
			e.printStackTrace();  // ���� ���� �� ���
		}
	}
}
