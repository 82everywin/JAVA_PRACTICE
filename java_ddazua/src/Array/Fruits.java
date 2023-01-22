package Array;

import java.util.Scanner;

public class Fruits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String []fruits =new String[3];
		
		System.out.println("과일을 입력하세요 : (3개입력)");
		for(int i=0;i<3;i++) {
			fruits[i]=sc.next();
		}
		
		System.out.println("----주문받은 과일------");
		for(String i: fruits) {
			System.out.print(i+" ");
		}
	}
}


