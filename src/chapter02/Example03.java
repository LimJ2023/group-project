package chapter02;

public class Example03 {

	public static void main(String[] args) {

		/* 1. 삼항연산자로 score1이 60보다 크거나 같으면 합격 아니면 불합격
		 * 점수는 60점
		 * 
		 * 2. 삼항연산자로 score2가 90보다 크면 'A'
		 *  score가 80보다 크면 'B' 그 이하는 모두 'C'
		 *  점수는 82점으로 배정
		 */
		
		int score1 = 60;
		String result1 = (score1 >= 60) ? "합격" : "불합격";
		System.out.println(result1);
		
		int score2 = 82;
		char result2 = (score2 > 90) ? 'a' : (score2 > 80) ? 'B' : 'C';
		System.out.println(result2);
		
		
		
		
	}

}
