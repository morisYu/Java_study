package chap10.sec07.art02;

import chap10.sec07.art01.BalanceInsufficientException;

public class Account {
	private long balance;

	public Account() {

	}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) throws BalanceInsufficientException {
		if (balance < money) {
			throw new BalanceInsufficientException("잔고부족: " + (money - balance) + " 모자람");
		}
		balance -= money;
	}

	public static void main(String[] args) throws BalanceInsufficientException {
		Account account = new Account();

		System.out.println(account.getBalance());
		
		account.deposit(10000);
		
		System.out.println(account.getBalance());
		
		account.withdraw(20000);
	}
}
