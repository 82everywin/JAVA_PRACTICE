package Array;

public class Array_1 {
	public static void main(String[] args) {
		// 3명의 학생 점수를 저장
		int score1 = 100;
		int score2 = 80;
		int score3 = 70;
		System.out.println("첫 번쨰 학생의 점수 :" + score1 + "점");
		System.out.println("두 번쨰 학생의 점수 :" + score2 + "점");
		System.out.println("세 번쨰 학생의 점수 :" + score3 + "점");

		int scores[];
		scores = new int[30];

		scores[0] = 100;
		scores[1] = 80;
		scores[2] = 70;

		for (int i = 0; i < 3; i++) {
			System.out.println((i+1)+"번쨰 학생의 점수 :" + scores[i] + "점");
		}
	}
}
