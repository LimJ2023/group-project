package chapter02;

public class Example04 {

	public static void main(String[] args) {

		/* 534개의 책을 학생 30명에게 똑같이 나누어줄 때
		 * 학생당 몇개씩 가지고 최종적으로 몇개 남는지 구하기
		 * books, students
		 */
		
		int books = 534;
		int students = 30;
		
		// 학생 한 명이 가지는 책의 수
		int gBooks = books / students;
		// 남은 책의 수
		int oBooks = books % students;
		
		System.out.println("학생 한 명이 가지는 책의 수 :" + gBooks);
		System.out.println("남은 책의 수 :" + oBooks);
		
	}

}
