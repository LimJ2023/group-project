package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample02 {

	public static void main(String[] args) {

		int dat;
		dat = Integer.parseInt(JOptionPane.showInputDialog("값을 입력하세요."));
		
		//10의 배수를 판단 (dat에 담겨있는 값을 10으로 나눈 나머지가 0인지 판단)
		if(dat%10 == 0) {
			System.out.println(dat + "는 10의 배수입니다.");
		}
		else {
			System.out.println(dat + "는 10의 배수가 아닙니다.");
		}
		
		
	}

}
