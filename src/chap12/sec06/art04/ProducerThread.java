package chap12.sec06.art04;

public class ProducerThread extends Thread{
	private DataBox dataBox;
	
	public ProducerThread(DataBox dataBox) {
		// ������ü�� �ʵ忡 ����
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		// ���ο� ������ ����
		for(int i=1;i<=3;i++) {
			String data = "Data-"+i;
			dataBox.setData(data);
		}
	}
}
