package loop;

public class Ex03 {

	public static void main(String[] args) {
		
		//반복문에 필요한 변수 => 합계와 숫자
		//조건문			   => 10번
		//반복하고 싶은 코드	=> sum에 숫자를 더하는 동작
		
		int num = 1;
		int sum = 0;
		
		while(num<=10) {
			sum += num;
			num++;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
	}

}
