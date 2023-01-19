package Array;

import java.util.Scanner;

public class MultiArray_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int scores[][] = new int[4][3];
		String subject[]= {"국어","영어","수학"};
		
		for(int i=0;i<scores.length;i++) {
			System.out.println((i+1)+"번 학생 점수----");
			for(int j=0;j<subject.length;j++) {
				System.out.print(subject[j]+":");
				scores[i][j]=sc.nextInt();
				//System.out.println();
			}
		}
		for(int i=0;i<subject.length;i++) {
			System.out.print("\t"+subject[i]);			
		}
		System.out.println();
		
		for(int i=0;i<scores.length;i++) {
			System.out.print((i+1)+"번:\t");
			for(int j=0;j<scores[1].length;j++) {
				System.out.print(scores[i][j]+"\t");
				}
			System.out.println();
			
		}
	}
}
