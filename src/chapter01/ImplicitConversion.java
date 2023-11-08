package chapter01;

public class ImplicitConversion {
	
	public static void main(String[] args) {
		
		//묵시적 형변환 : 작은 메모리 -> 큰 메모리로 자연스럽게 형변환
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum2);
		System.out.println(fNum);
	}
}
