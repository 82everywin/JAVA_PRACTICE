package Array;

public class UserArray {
	public static void main(String[] args) {
		
		User user[]=new User[4];
		
		for(int i=0;i<4;i++) {
			user[i]=new User();
		}
		
		user[0].name="가길동";
		user[0].phone="010-1234-1234";
		user[0].age=20;
		user[0].gender="남자";
		
		user[1].name="나길동";
		user[1].phone="010-3333-4444";
		user[1].age=32;
		user[1].gender="여자";
		
		user[2].name="다길동";
		user[2].phone="010-1111-2222";
		user[2].age=27;
		user[2].gender="남자";
		
		user[3].name="라길동";
		user[3].phone="010-4321-4321";
		user[3].age=33;
		user[3].gender="여자";
		
		for(int i =0;i<4;i++) {
			System.out.println("[사용자"+(i+1)+"]");
			user[i].Info();
		}
		
	}
}

class User{
	String name;
	String phone;
	int age;
	String gender;
	
	void Info() {
		System.out.println("name :"+name);
		System.out.println("phone :"+phone);
		System.out.println("age :"+age);
		System.out.println("gender :"+gender);
	}
}
