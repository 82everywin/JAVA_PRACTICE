package AccessModifier;

public class AccessModifier1 {
	public static void main(String[] args) {
		
		User user1= new User("철수",20);
		User user2=new User("영희",19);
		
//		user1.age=30; //제어자 private : 직접 접근이 불가능함. 
		
//		System.out.println(user1.name + "의 나이는 (new) "+user1.age);
//		System.out.println(user2.name + "의 나이는 "+user2.age);
	
		System.out.println(user1.getName()+"의 나이는 "+user1.getAge());
		user1.setAge(24);
		System.out.println(user1.getName()+"의 나이는 "+user1.getAge());
	
		System.out.println(user2.getName()+"의 나이는 "+user2.getAge());
		
		user2.setName("현승");
		System.out.println(user2.getName()+"의 나이는 "+ user2.getAge());
	}
}

class User {
//	public String name;
//	public int age;
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	User(String name,int age){
		this.name=name;
		this.age=age;
	}
}
