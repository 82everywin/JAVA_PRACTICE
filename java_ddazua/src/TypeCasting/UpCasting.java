package TypeCasting;

public class UpCasting {

	public static void main(String[] args) {
		Students st1 = new Students("가길동",25,"게임하기",3);
		System.out.println(st1.toString());
		//업캐스팅
		Human h1= new Students("나길동",19,"요가",2);
		System.out.println(h1.toString());
		
		st1.toString();
		//h1.study(); h1은 Human 클래스의 참조변수이기 때문에 
	}
}

class Human{
	String name;
	int age;
	String hobby;
	
	
	
	public Human(String name, int age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}

	
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", hobby=" + hobby + "]";
	}
	
}

class Students extends Human{
	int grade;
	
	public Students(String name, int age, String hobby,int grade) {
		super(name, age, hobby);
		this.grade=grade;
	}

	@Override
	public String toString() {
		return "Students [grade=" + grade + ", name=" + name + ", age=" + age + ", hobby=" + hobby + "]";
	}
	
	void study() { 
		System.out.println("공부하기");
	}
	


}