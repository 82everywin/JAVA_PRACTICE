package Array;

import java.util.Scanner;

public class UserArray_1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		User user[]=new User[4];
		
		for(int i=0;i<4;i++) {
			
			user[i]=new User();
			System.out.println("사용자"+(i+1)+"입력");
			
			System.out.print("name:");
			user[i].name=sc.next();
			System.out.print("phone:");
			user[i].phone=sc.next();
			System.out.print("age:");
			user[i].age=sc.nextInt();
			System.out.print("gender:");
			user[i].gender=sc.next();
		}
		
		for(int i =0;i<4;i++) {
			user[i].Info();
		}
		
	}
}
