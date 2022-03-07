package chap11.sec06.art03;

public class NewInstanceExample {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		// 기존 new 연산자를 사용해서 객체 생성
		SendAction send = new SendAction();
		ReceiveAction receive = new ReceiveAction();
		System.out.println(send.getClass().getName());
		System.out.println(receive.getClass().getName());

		// Class 객체의 newInstance() 메소드를 호출해서 동적 객체 생성
		try {
			Class clazz = Class.forName("chap11.sec06.art03.SendAction");
			Class clazz2 = Class.forName("chap11.sec06.art03.ReceiveAction");
			Action action = (Action) clazz.newInstance();
			action.execute();
			Action action2 = (Action) clazz2.newInstance();
			action2.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
