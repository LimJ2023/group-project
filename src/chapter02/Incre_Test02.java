package chapter02;

public class Incre_Test02 {
	public static void main(String[] args) {
		//전위연산
		int gameScore = 150;
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1); //151
		System.out.println("=============");
		int lastScore2 = --gameScore; 
		System.out.println(lastScore2); //150
		System.out.println("=============");
		//후위연산
		System.out.println("======후위연산=======");
		int lastscore3 = gameScore++;
		System.out.println(lastscore3); // 150
		System.out.println(gameScore); // 151
		System.out.println("=============");
		
		int lastScore4 = gameScore--; 
		System.out.println(lastScore4); //151
		System.out.println(gameScore); // 150
		System.out.println("=============");
		
	}
}
