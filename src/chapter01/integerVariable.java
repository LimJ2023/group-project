package chapter01;

public class integerVariable {

	public static void main(String[] args) {
		
		short sVal = 10;
		byte bVal = 20;
		
		int result = sVal + bVal;
		
		//syso : println()단축키
		System.out.println("두 수의 합 : " + result);
											//연산시 괄호로 묶어주기
											//자동 형변환시 int로 반환
		System.out.println("두 수의 합 : " + (sVal+bVal));
		
		
	}

}
