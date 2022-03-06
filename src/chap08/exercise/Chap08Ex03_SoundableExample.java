package chap08.exercise;

public class Chap08Ex03_SoundableExample {
	private static void printSound(Chap08Ex03_Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] arga) {
		
		printSound(new Chap08Ex03_Cat());
		printSound(new Chap08Ex03_Dog());
	}
}
