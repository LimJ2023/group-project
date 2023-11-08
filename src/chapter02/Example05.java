package chapter02;

public class Example05 {

	public static void main(String[] args) {

		/* 코드 내에 직접 값을 설정합니다.
		 * 그 수가 양수인지 여부를 판별하는 프로그램을 만들어보세요.
		 * 입력 받은 정수가 양수인 경우, "양수 입니다"
		 * 그렇지 않은 경우 "음수 또는 0입니다." 라고 출력하세요.
		 */
		//1. 초기화
		int num = 5;
		//2.관계 연산자 사용해서 양수 여부 판별
		boolean isPositive = (num > 0);
		// 3. 삼항 연산자 사용해서 결과 출력
		String result1 = isPositive ? "양수 입니다" : "음수 또는 0입니다.";
		System.out.println(result1);
		
	}

}
