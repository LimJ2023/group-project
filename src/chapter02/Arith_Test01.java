package chapter02;

public class Arith_Test01 {

	public static void main(String[] args) {

		int mathScore = 96;
		int engScore = 87;
		
		//총점
		System.out.println("총점 : " + (mathScore+engScore));
		
		//평균
		System.out.println("평균 : " + (mathScore+engScore) / 2);
		
		int total = (mathScore+engScore);
		double average = total / 2;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		
	}

}
