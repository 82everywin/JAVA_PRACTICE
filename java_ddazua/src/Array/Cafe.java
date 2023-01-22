package Array;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

public class Cafe {

	/*
	 * 카페프로그램 
	 *1)기능  
	 * 1.주문하기 
	 * 	1] 주문가능한 메뉴를 출력한다. 
	 * 	2] 주문 받르 메뉴를 입력 받는다. 
	 *  3] 주문한 메뉴의 가격을 총금액에 누적한다. 
	 *  4] 주문한 메뉴를 전체 메뉴리스트에 추가한다. 
	 *  5] 주문한 개수를 한개 증가한다. 
	 * 2.취소하기 
	 *  1] 주문한 메뉴리스트를 출력한다. 
	 *  2] 그 중에서 취소한 메뉴를 입력받는다. 
	 *  3] 입력 받은 메뉴를 주문리스트에서 제거한다.
	 *  4] 입력 받은 메뉴의 금액을 총 금액에서 차감한다. 
	 *  5] 주문한 개수를 한 개 감소한다.
	 * 3.결제하기 
	 *  1] 결제해야할 총 금액을 출력한다.
	 *  2] 사용자에게 지불할 금액을 입력 받는다. 
	 *  3] 지불한 금액과 총 금액을 비교해서,   
	 *      만약 지불한 금액< 총금액이면? "잔돈이 부족합니다" 출력후 결제 취소
	 *       그게 아니라면, 잔돈과 함꼐 계산완료를 출력한다. 
	 *  4] 총 금액은 0원으로 주문리스트는 비워준다. 
	 *  5] 전체 개수를 0개로 초기화한다.
	 * 4.끝내기 
	 *2)
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = 0; // 전체 개수 저장할 변수
		String orderList[] = new String[5]; // 주문한 메뉴를 저장할 문자열 배열
		int price = 0; // 총 금액 저장할 변수

		while (true) {
			System.out.println("☆★☆★☆★☆★☆★☆★☆ Cafe ☆★☆★☆★☆★☆★☆★☆ ");
			System.out.println("1. 주문하기");
			System.out.println("2. 취소하기");
			System.out.println("3. 결제하기");
			System.out.println("4. 끝내기");
			System.out.print("입력:");
			int num = sc.nextInt();
			/*
			 * 1.주문하기 
			 *  1] 주문가능한 메뉴를 출력한다.
			 *  2] 주문 받을 메뉴를 입력 받는다. 
			 *  3] 주문한 메뉴의 가격을 총 금액에 누적한다. 
			 *  4] 주문한 메뉴를 전체 메뉴리스트에 추가한다. 
			 *  5] 주문한 개수를 한개 증가한다.
			 */
			if (num == 1) { //주문하기 
				
				int i =0;
				while(i<orderList.length) {
				System.out.println("------MENU------");
				System.out.println("1.아메리카노\t3800원");
				System.out.println("2.에스프레소\t2400원");
				System.out.println("3.카페라떼\t4200원");
				System.out.println("4.밀크티\t5100원");
				System.out.println("//주문하기 종료=> 0//");
				System.out.print("주문할 메뉴 번호 :");
				int menuNum = sc.nextInt();
				
				if(menuNum == 0) {
					break;
				}
				switch (menuNum) {
				case 1:
					price += 3800;
					orderList[i]="아메리카노";
					break;
				case 2:
					price += 2400;
					orderList[i]="에스프레소";
					break;
				case 3:
					price += 4200;
					orderList[i]="카페라떼";
					break;
				case 4:
					price += 5100;
					orderList[i]="밀크티";
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
				i++;
				count ++;
				}
				System.out.println("주문 개수 : "+count + "개" );
				System.out.println(Arrays.toString(orderList));
				System.out.println("주문 금액 : "+price+"원" );
			} else if (num == 2) {
				/*
				 * 2.취소하기 
				 *  1] 주문한 메뉴리스트를 출력한다. 
				 *  2] 그 중에서 취소한 메뉴를 입력받는다. 
				 *  3] 입력 받은 메뉴를 주문리스트에서 제거한다.
				 *  4] 입력 받은 메뉴의 금액을 총 금액에서 차감한다. 
				 *  5] 주문한 개수를 한 개 감소한다.
				 */
				System.out.println("----주문한 메뉴 리스트!----");
				for(int j=0;j<count;j++) {
					System.out.println((j+1)+"."+orderList[j]);
				}
				System.out.print("취소할 메뉴번호 : ");
				int CancelNum = sc.nextInt();
				if(1<=CancelNum && CancelNum<=count) {
					String delMenu = orderList[CancelNum-1];
					System.out.println(delMenu +"메뉴 삭제!");
					for(int i=CancelNum-1;i<count;i++) {
						if(i==4 &&count==5) {
							orderList[i]=null;
						}else {
							orderList[i]=orderList[i+1];
						}
					}
					if(delMenu.equals("아메리카노")) {
						price-=3800;
					}else if(delMenu.equals("에스프레소")) {
						price-=2400;
					}else if(delMenu.equals("카페라떼")) {
						price-=4200;
					}else if(delMenu.equals("밀크티")){
						price-=5100;
					}
					count--;
				}
				System.out.println("주문 개수 : "+count + "개" );
				System.out.println(Arrays.toString(orderList));
				System.out.println("주문 금액 : "+price+"원" );
				
			} else if (num == 3) {
				/*
				 * 3.결제하기 
				 *  1] 결제해야할 총 금액을 출력한다.
				 *  2] 사용자에게 지불할 금액을 입력 받는다. 
				 *  3] 지불한 금액과 총 금액을 비교해서,   
				 *      만약 지불한 금액< 총금액이면? "잔돈이 부족합니다" 출력후 결제 취소
				 *       그게 아니라면, 잔돈과 함꼐 계산완료를 출력한다. 
				 *  4] 총 금액은 0원으로 주문리스트는 비워준다. 
				 *  5] 전체 개수를 0개로 초기화한다.
				 */
				System.out.println("결제할 총 금액은 "+price+"원 입니다.");
				System.out.print("지불할 금액 입력 : ");
				int pay=sc.nextInt();
				while(pay<price) {
					if(pay==price) {
						System.out.println("결제 완료");
						break;
					}
					System.out.println("잔돈이 부족합니다.\n결제를 취소합니다. ");
					System.out.println("금액을 재입력해주세요.");
					pay=sc.nextInt();
				}	
				for(int i=0;i<count;i++) {
					orderList[i]=null;
				}
				price=0;
				count=0;
				System.out.println("==== 주문 리스트 ====");
				System.out.println(Arrays.toString(orderList));
				System.out.println("결제할 총 금액은 "+price+"원 입니다.");
				System.out.println("전체 개수 :"+count+"개 \n결제하기 창을 초기화합니다.");
				
			} else if (num == 4) {
				System.out.println("반복 종료");
				break;
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}
}
