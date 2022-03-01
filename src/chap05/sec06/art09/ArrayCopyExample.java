package chap05.sec06.art09;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = { "Java", "array", "copy" };
		String[] newStrArray = new String[5];
		// System.arraycopy(원본배열,원본배열 복사시작위치,사본배열,사본배열 복사시작위치,원본배열 복사 갯수)
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

		for (int i = 0; i < newStrArray.length; i++) {
			if (i != (newStrArray.length - 1)) {
				System.out.print(newStrArray[i] + ", ");
			} else {
				System.out.print(newStrArray[i]);
			}

		}
	}
}
