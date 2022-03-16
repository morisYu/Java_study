package chap12.sec06.art04;

public class ConsummerThread extends Thread{
	private DataBox dataBox;
	
	public ConsummerThread(DataBox dataBox) {
		// 공유 객체를 필드에 저장
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		// 새로운 데이터를 읽음
		for(int i=1;i<=3;i++) {
			String data = dataBox.getData();
		}
	}
}
