package conditional.quiz;

public class Quiz06 {

	public static void main(String[] args) {
		
		int score = 75;
		
		if(score >= 90 && score < 100) {
			System.out.println("수");
			
		} else if(score >= 80) {
			System.out.println("우");
			
		} else if(score >= 70) {
			System.out.println("미");
			
		} else {
			System.out.println("양");
			
		}
		
	}

}
