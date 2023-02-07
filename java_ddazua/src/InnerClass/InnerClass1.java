package InnerClass;

public class InnerClass1 {
	public static void main(String[] args) {
		
	}
}

class A{ 
	static class StaticInner{}
	class InstanceInner{}
	
	//클래스 객체 생성
	StaticInner st1= new StaticInner();
	InstanceInner ii1 = new InstanceInner();
	
	static void StaticMethod() {
		StaticInner st2= new StaticInner();
		//InstanceInner ii2 = new InstanceInner(); 
		//=> static메서드는 인스천스 멤버 접근 불가능	
	}
	//인스턴스 메서드는 스태틱 클래스, 인스턴스 클래스 모두 접근 가능
	void InstanceMethod() {
		StaticInner st3= new StaticInner();
		InstanceInner ii3 = new InstanceInner();
		
	}
}