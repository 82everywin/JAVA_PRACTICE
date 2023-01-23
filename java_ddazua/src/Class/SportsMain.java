package Class;

public class SportsMain {

	public static void main(String[] args) {
		Member mem1 = new Member();
		Member mem2 = new Member();
		Member mem3 = new Member();
		Member mem4 = new Member();
		
		Member.centerName="byeee";
	
		mem1.name="김철수";
		mem1.age=32;
		mem1.gender="남자";
		mem1.Info();
		System.out.println();
		
		mem2.name="김민호";
		mem2.age=28;
		mem2.gender="남자";
		mem2.Info();
		System.out.println();
		
		mem3.name="이영희";
		mem3.age=24;
		mem3.gender="여자";
		mem3.Info();
		System.out.println();
		
		mem4.name="고석천";
		mem4.age=32;
		mem4.gender="남자";
		mem4.Info();
		
	}
}

class Member {
	static String centerName = "Hello";
	String name;
	int age;
	String gender;
	
	void Info() {
		System.out.println("center Name :"+ centerName);
		System.out.println("Name :"+ name);
		System.out.println("Age :"+ age);
		System.out.println("Gender :"+ gender);
		
	}
}
