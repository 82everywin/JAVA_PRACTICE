package InnerClass;

public class Anonymous2 {
	public static void main(String[] args) {
		//익명클래스 생성 <- 기존클래스 오버라이딩
		OuterClass1 outer= new OuterClass1() {
			void a() {
				System.out.println("새롭게 정의한 익명클래스 메서드입니다.");
			}
		};
		outer.a();
		OuterClass1 ok = new OuterClass1() {};
		ok.a(); //익명클래스는 1회성
	}
}

class OuterClass1{
	void a() {System.out.println("method a");}
	void b() {}
}
