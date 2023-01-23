package Class;

public class FirstClass {
	public static void main(String[] args) {
		//자료형 변수=객체값;
		//클래스명 참조변수 = new 클래스명();
		ClassA a=new ClassA();
		System.out.println(a.x);
		int b=a.x; 
		System.out.println(b+10); // 연산 
		
		a.x=15;
		System.out.println(a.x);  //변수에 값 저장
		a.f1();
	}
}

class ClassA{
	int x=10;
	void f1() {
		System.out.println("f1() 출력!");
	}
	
	
}
