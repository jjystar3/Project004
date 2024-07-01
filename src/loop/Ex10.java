package loop;

public class Ex10 {

	public static void main(String[] args) {

		for (int dan = 2; dan <= 9; dan++) {
			System.out.print("================" + dan + "단================\n");
			for (int times = 1; times <= 9; times++) {
				System.out.println(dan + " x " + times + " = " + dan * times);
			}
		}

	}

}
