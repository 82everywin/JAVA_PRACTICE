package InnerClass;

public class Anonymous3 {

	public static void main(String[] args) {
		//인터페이스는 객체생성 불가
		// 죽, 익명클래스로 오버라이딩하여 사용하면 가능!!
		Inter1 it=new Inter1() {

			@Override
			public void f1() {
				System.out.println("inter implements f1() ");
			}
		};	
		it.f1();
	}
}

interface Inter1 {
	void f1();
}