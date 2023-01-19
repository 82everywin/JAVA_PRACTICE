/*
 * 로또번호 생성기 
 * 
 */

package Array;

import java.util.*;

public class Lotto {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int lottoar[] = new int[6];
		int user[] = new int [6];
		
		int bonus;
		int bonusUser;
		
		int count=0;
		
		for(int i=0;i<lottoar.length;i++) {
			lottoar[i]=random.nextInt(45)+1; //0~44+1 > 1~45			
		}
		
		bonus=random.nextInt(45)+1;

		System.out.println("로또 번호 생성 :"+ Arrays.toString(lottoar)
		+ "보너스 번호: "+ bonus);
		
		System.out.print("숫자 6개 입력하세요 (1~45까지 입력)");
		for(int i=0;i<user.length;i++) {
			user[i]=sc.nextInt();
		}
		System.out.print("보너스 값을 입력하세요");
		bonusUser=sc.nextInt();
		
		System.out.println("사용자 로또 번호 입력 :"+ Arrays.toString(user)
		+ "\n 보너스 번호 입력 : "+ bonusUser);
		
		// 로또배열의 값과 사용자배열의 값 중 같은 값이 몇개 있는지 카운팅
		
		for(int i=0;i<lottoar.length;i++) {
			for(int j=0;j<user.length;j++) {
				if(lottoar[i]== user[j]) {
					count++;
				}
			}
		}

		System.out.println("-----------------------");
		System.out.println("총 맞춘 개수"+ count);
		
		if(count == 6) {
			System.out.println("축하드립니다! 1등입니다!");
		}
		else if(count==5) {
			if(bonus==bonusUser) {
				System.out.println("축하드립니다! 2등입니다~!");
			}
			else {
				System.out.println("축하드립니다! 3등입니다~!");
			}
		}
		else if(count==4) {
			System.out.println("축하드립니다! 4등입니다~!");
		}
		else if(count==3) {
			System.out.println("축하드립니다! 5등입니다~!");
		}
		else {
			System.out.println("아쉽게도 낙첨입니다...");
		}
		
		
	}
}
