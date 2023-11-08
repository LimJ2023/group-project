package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample05 {

	public static void main(String[] args) {

		//전시회 입장료는 미취학 아동 :1000원
		// 초등학생 2000원 중고등학생 3500원 성인 5000원
		// 논리 연산자 사용해서 만들기
		int age;
		int charge;
		
		age = Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요."));
		
		if((age >= 0) && (age < 7)) {
			charge = 1000;
			System.out.println("미취학 아동입니다.");
		}
		else if ((age >= 7) && (age < 13))  {
			charge = 2000;
			System.out.println("초등학생 입니다.");
		}
		else if ((age >=13) && (age <= 19))  {
			charge = 3500;
			System.out.println("중고등학생입니다.");
		}
		else {
			charge = 5000;
			System.out.println("성인입니다.");
		}
		
		System.out.println("입장료는 : " + charge + "원 입니다.");
		
	}

}
