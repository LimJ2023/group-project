package chapter02;

import java.util.Scanner;

public class Bit_Test02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력 : ");
		int num1 = scanner.nextInt();
		
		System.out.print("두번째 숫자 입력 : ");
		int num2 = scanner.nextInt();
		
		int andResult = num1 & num2;
		int orResult = num1 | num2;
		int xorResult = num1 ^ num2;
		System.out.println(andResult);
		System.out.println(orResult);
		System.out.println(xorResult);
		
		scanner.close();
	}

}
