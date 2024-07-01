package loop.quiz;

public class Quiz08 {

	public static void main(String[] args) {
		
		for (int dan = 1; dan <= 9; dan++) {
			if(dan % 2 != 0) {
				System.out.print("================" + dan + "단================\n");
				for (int times = 1; times <= 9; times++) {
					System.out.println(dan + " x " + times + " = " + dan * times);
				}
			}
		}
		
	}
	
}
