package loop.quiz;

public class Quiz05 {

	public static void main(String[] args) {
		
		// continue을 썼을 때
		for (int i = 1; i <= 100; i++) {
			if (i % 3 != 0) {
				continue;
			}
			System.out.println(i);
		}
		
		// continue을 안 썼을 때
//		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0) {
//				System.out.println(i);
//			}
//		}
	}

}
