package chap06.exercise;

public class Chap06Ex20_Account {

	// �ʵ�
	private String ano;
	private String owner;
	private int balance;

	// ������
	public Chap06Ex20_Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	// �޼ҵ�
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if ((this.balance + balance) < 0) {
			System.out.println(Math.abs((this.balance + balance)) + " ���� �����մϴ�.");
			return;
		}
		this.balance += balance;
	}
}
