package chapter01;

public class LongVariable {

	public static void main(String[] args) {

		// int num1 = 12345678900; <- out of range 오류
		long num2 = 12345678900l;
		long num3 = 1000; //int로 인식
		
		
		int level; // 선언
		level = 10; // 리터널 값;
		
		//두 개의 다른 자료형을 연산하면 큰 범위를 가진 쪽으로 자동 형변환됨
		System.out.println(num2 + num3); //long타입
		System.out.println(level); 
		
		
		
	}

}
