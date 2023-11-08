package chapter02;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		
		/* 스캐너 사용하여 두개의 불리언 변수 isSunny isWarm 입력받아
		 * 화창하면서 따뜻한지 여부를 출력하는 프로그램
		 * 화창하며 따뜻할때 isNiceWeather를 사용
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("날씨가 화창한가요? true/false ");
		boolean isSunny = scanner.nextBoolean();
		System.out.println("날씨가 따뜻한가요? true/false ");
		boolean isWarm = scanner.nextBoolean();
		
		boolean isNiceWeather = isSunny && isWarm;
		
		System.out.println("좋은 날씨인가요?" + isNiceWeather);
		
		scanner.close();
	}

}
