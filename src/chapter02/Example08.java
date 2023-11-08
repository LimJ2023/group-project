package chapter02;

import java.util.Scanner;

public class Example08 {
	public static void main(String[] args) {
		
		/* 두 개의 숫자를 입력받아서 첫번째 숫자가 두번째 숫자보다
		 * 큰지 여부를 출력하는 프로그램을 작성
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주세요.");
		int num1 = scanner.nextInt();
		System.out.println("두번째 숫자를 입력해주세요.");
		int num2 = scanner.nextInt();
		
		boolean isgreater = num1 > num2;
		
		System.out.println("첫번째 숫자가 두번째보다 큰가요? " + isgreater);
		
		scanner.close();
		
		
	}
}
