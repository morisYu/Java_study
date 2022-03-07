package chap11.sec03.art05;

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println(no+" ¹ø °´Ã¼ÀÇ finalize()°¡ ½ÇÇàµÊ.");
	}
	
	@Override
	public int hashCode() {
		return no;
	}
}
