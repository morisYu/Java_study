package chap06.exercise;

public class Chap06Ex19_AccountExample {
	public static void main(String[] args) {
		Chap06Ex19_Account account = new Chap06Ex19_Account();
		
		account.setBalance(10000);
		System.out.println("ÇöÀç ÀÜ°í: "+account.getBalance());
		
		account.setBalance(-100);
		System.out.println("ÇöÀç ÀÜ°í: "+account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("ÇöÀç ÀÜ°í: "+account.getBalance());
		
		account.setBalance(300000);
		System.out.println("ÇöÀç ÀÜ°í: "+account.getBalance());
	}
}
