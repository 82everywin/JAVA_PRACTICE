package InnerClass;

public class Anonymous4 {
	public static void main(String[] args) {
		// 추상클래스 객체생성 불가
		//Abstract ab = new Abstract(); 
		
		Abstract ab= new Abstract() {

			@Override
			void f2() {
				System.out.println("추상메서드 오버라이딩 f2()");
			}
		};
		ab.f2();
	}
}

abstract class Abstract{
	abstract void f2();
}
