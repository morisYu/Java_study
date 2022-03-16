package chap12.sec06.art04;

public class DataBox {

	private String data;

	public synchronized String getData() {
		if (this.data == null) {
			// data�ʵ尡 null �̸� �Һ��� �����带 �Ͻ� ���� ���·� ����
			try {
				wait();
			} catch (InterruptedException e) {

			}
		}
		String returnValue = data;
		System.out.println("ConsummerThread�� ���� ������: " + returnValue);
		
		// data �ʵ带 null �� ����� ������ �����带 ���� ��� ���·� ����
		data = null;
		notify();
		return returnValue;
	}

	public synchronized void setData(String data) {
		// data �ʵ尡 null�� �ƴϸ� ������ �����带 �Ͻ� ���� ���·� ����
		if(this.data != null) {
			try {
				wait();
			}catch(InterruptedException e) {
				
			}
		}
		
		// data �ʵ忡 ���� �����ϰ� �Һ��� �����带 ���� ��� ���·� ����
		this.data = data;
		System.out.println("ProducerThread�� ������ ������: "+data);
		notify();
	}
}
