package Interface;

public class Interface1 {

	public static void main(String[] args) {
		Ainter a ;
		// a.x =30;  // 상수여서 변경 불가
		// a.y = 30; // final을 생략해도 final임 \
		
		B b = new B();
		b.methodA();
		b.methodB();
		//b.x=10; // 마찬가지..;변경 불가 
		System.out.println(b.x);
	}
}

interface Ainter{
	final int x=10;
	int y=20; // final 생략 가능
	
	abstract void methodA();
	void methodB(); //abstract 생략 가능
}

class B implements Ainter {

	@Override
	public void methodA() {
		System.out.println("methodA()");
	}

	@Override
	public void methodB() {
		System.out.println("methodB()");
	}
	
}