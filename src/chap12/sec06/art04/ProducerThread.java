package chap12.sec06.art04;

public class ProducerThread extends Thread{
	private DataBox dataBox;
	
	public ProducerThread(DataBox dataBox) {
		// 공유객체를 필드에 저장
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		// 새로운 데이터 저장
		for(int i=1;i<=3;i++) {
			String data = "Data-"+i;
			dataBox.setData(data);
		}
	}
}
