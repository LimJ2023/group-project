package chapter02;

public class Example01 {

	public static void main(String[] args) {

		/*soldesk 과수원
		 * 배, 사과 오렌지를 키우고 있는데 하루에 생산되는 양은 5, 7, 5 개
		 * 하루 총 과일의 개수를 출력하고
		 * 시간당(24) 전체 과일의 평균 생산 개수를 출력하세요
		 * 단, 평균값은 float로 정의
		 */
		int nBae = 5;
		int nSagwa = 7;
		int nOrange = 5;
		
		int dayTotal = nBae + nOrange + nSagwa;
		
		float avg = (float) dayTotal / 24;
		
		System.out.println("하루 총 생산량은 : " + dayTotal);
		System.out.println("시간당 평균 생산 개수는 : " + avg);
		
		
	}

}
