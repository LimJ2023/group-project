package chapter02;

public class Example09 {
	public static void main(String[] args) {
		
		// 바이트 크기가 작은 자료형을 더 큰 자료형으로 대입하는 자동형변환 코드 2가지 구현
		byte num1 = 10;
		short num2 = num1;
		System.out.println(num2);
		
		int num3 = 10000;
		long num4 = num3;
		System.out.println(num4);
		
		//실수를 정수형 변수에 대입하는 경우 형변환
		// 소수점 이하 부분이 없어지는 형변환 코드 구현
		float num5 = 3.14f;
		int num6 = (int) num5;
		System.out.println(num6);
		
		// 더 많은 실수를 표현하기 위해서 가수부와 지수부로 비트를 나누어 표현하는 방식은?
		//부동소수점 방식
		
		// 변수 두개를 선언해서 10과 2.5를 대입하고 두 변수의 사칙연산 결과를 정수로만 출력
		int num7 = 10;
		double num8 = 2.5;
		int sum1 = num7 + (int)num8;
		int sum2 = num7 * (int)num8;
		int sum3 = num7 / (int)num8;
		int sum4 = num7 - (int)num8;
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		// '글' 이라는 한글 문자의 유니코드 값을 찾아서 char 형으로 선언한 변수에 저장한 뒤 출력
		char c1 = '\uAE00';
		System.out.println(c1);
	}
}
