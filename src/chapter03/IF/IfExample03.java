package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample03 {

	public static void main(String[] args) {

		char grade;
		int jumsu;
		
		jumsu = Integer.parseInt(JOptionPane.showInputDialog("Java 점수"));
		
		if(jumsu >= 90) {
			grade = 'A';
			System.out.println("최우수 학생입니다.");
		}else if (jumsu >= 80) {
			grade = 'B';
			System.out.println("우수 학생입니다.");
		}else if (jumsu >= 70) {
			grade = 'C';
		}else if (jumsu >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.println("당신의 학점은 : " + grade + "입니다.");
	}

}
