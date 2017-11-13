package Exceptions;

public class Whiz27 {

	public static void main(String[] args) {
		int y = 0;
		while (y-- < 10) {
			continue;
		}
		String message = y > 10 ? "Greater than" : "Less than";
		System.out.println(message + " 10");

	}

}
