package TypeCasting;

public class Polymorphism1 {
	public static void main(String[] args) {
		
		A obj = new B(); // 부모변수= 자식값 ; 업캐스팅!
		obj.methodA();
		//obj.methodB(); // 컴파일시부터 정의되지 않았음 A 내에서만 정의됨 
	}

}

class A{
	void methodA() {
		System.out.println("methodA");
	}
}

class B extends A{
	void methodB() {
		System.out.println("methodB");
	}
}
