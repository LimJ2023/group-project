package chapter02;

import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {

		/* 한자리수 숫자를 입력받아
		 * 숫자가 짝수인지 홀수인지 출력하는 삼항 연산자를 작성
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("한 자리수 숫자를 입력해주세요 : ");
		int num1 = scanner.nextInt();
		
		String oddEven = ((num1%2) == 0) ? "짝수입니다." : "홀수입니다.";
		System.out.println(oddEven);
		
		scanner.close();
		
	}

}
