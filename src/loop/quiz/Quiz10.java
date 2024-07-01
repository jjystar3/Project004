package loop.quiz;

public class Quiz10 {

	public static void main(String[] args) {

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		int length = 5;

		for (int i = 1; i <= length; i++) {
			for (int k = 1; k <= Math.abs(Math.round((float) length / 2) - i); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= length - (Math.abs(Math.round((float) length / 2) - i) * 2); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
