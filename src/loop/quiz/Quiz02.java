package loop.quiz;

public class Quiz02 {

	public static void main(String[] args) {
		
		int num = 11;
		int sum = 0;
		
		while(num<=20) {
			sum+=num;
			num++;
		}
		
		System.out.println("11부터 20까지 합은 " + sum + "입니다.");
		
	}

}
