package Exceptions;

public class Whiz32 {

	public static void main(String[] args) {
		int i = 1;

		if (i++ == 1)
			if (i++ > 2) {
				System.out.println(i);
			} else if (i++ > 3)
				System.out.println(i);
			else
				System.out.println(i);
	}

}
