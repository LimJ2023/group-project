package chapter02;

public class Bit_Test01 {

	public static void main(String[] args) {

		//bit 연산
		int num1 = 5;  //0101
		int num2 = 10; //1010
		
		// bit OR(|) 비트 값이 하나라도 1이면 연산 결과 값이 1
		int resultOR = num1 | num2; //15  1 2 4 8
		System.out.println(resultOR); 
		
		//Bit AND(&) 두 개의 비트값이 모두 1인 경우에 연산 결과값이 1
		int resultAND = num1 & num2;
		System.out.println(resultAND);
		
		//Bit XOR(^) 같은 값이면 0, 아니면 1;
		int resultXOR = num1 ^ num2;
		System.out.println(resultXOR);
		
		
	}

}
