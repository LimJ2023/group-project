package chapter02;

public class RelaTest01 {

	public static void main(String[] args) {

		
		char a,b;
		a='A'; //65
		b='B'; //66
		
		boolean AL = a > b;
		System.out.println(AL);
		
		// a가 b보다 크다고 명시할 경우
		System.out.println("a > b : " + (a>b));
		// b가 a보다 크다고 명시할 경우
		System.out.println("a < b : " + (a<b));
		// a와 b가 같다고 명시할 경우
		System.out.println("a == b : " + (a==b));
		// a와 b가 같지 않다고 명시할 경우
		System.out.println("a != b : " + (a!=b));
		
		System.out.println("================");
		
		int num1 = 5;
		int num2 = 3;
		
		//num1이 크다고 명시할 경우
		System.out.println("num1 > num2 : " + (num1>num2));
		//num1이 크거나 같다고 명시할 경우
		System.out.println("num1 >= num2 : " + (num1>=num2));
		//num1이 작다고 명시할 경우
		System.out.println("num1 < num2 : " + (num1<num2));
		//num1이 작거나 같다고 명시할 경우
		System.out.println("num1 <= num2 : " + (num1<=num2));
		//num1과 num2가 같다고 명시할 경우
		System.out.println("num1 == num2 : " + (num1==num2));
		//num1과 num2가 같지 않다고 명시할 경우
		System.out.println("num1 != num2 : " + (num1!=num2));
		
		
		
	}

}
