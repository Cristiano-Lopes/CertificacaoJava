package exceptions;

public class Whiz2 {

	static int i = 2;

	public static void main(String[] args) {
		int array[] = new int[i];
		array[1] = 7;
		array[2] = 8;

		System.out.println(array[1]);

	}

}
