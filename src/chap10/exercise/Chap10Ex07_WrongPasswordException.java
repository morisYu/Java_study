package chap10.exercise;

@SuppressWarnings("serial")
public class Chap10Ex07_WrongPasswordException extends Exception{
	public Chap10Ex07_WrongPasswordException() {

	}

	public Chap10Ex07_WrongPasswordException(String message) {
		super(message);
	}
}
