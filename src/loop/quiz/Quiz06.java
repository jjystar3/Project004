package loop.quiz;

public class Quiz06 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;

			if (sum >= 100) {
				System.out.println("num : " + i + ", sum : " + sum);
				break;
			}
		}

	}

}
