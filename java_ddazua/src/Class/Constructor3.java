package Class;

public class Constructor3 {

	public static void main(String[] args) {
		Bclass b1=new Bclass("가길동");
		System.out.println(b1.name);
		
		Bclass b2= new Bclass(); // 기본생성자 먼처 안만들면 호출 안됨. 매개변수 생성자가 이미 있기 때문
		
	}
}

class Bclass{
	String name;
	Bclass( ){
		System.out.println("기본생성자 호출");
	}
	Bclass(String name2){ //매개변수 생성자
		System.out.println("Bclass 의 매개변수 생성자()");
		this.name=name2;
	}
}
