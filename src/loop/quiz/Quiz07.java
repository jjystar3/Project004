package loop.quiz;

public class Quiz07 {

	public static void main(String[] args) {
		
		for (int dan = 3; dan <= 7; dan++) {
			System.out.print("================" + dan + "단================\n");
			for (int times = 1; times <= 9; times++) {
				System.out.println(dan + " x " + times + " = " + dan * times);
			}
		}
		
	}

}
