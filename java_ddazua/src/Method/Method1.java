package Method;

public class Method1 {
	public static void main(String[] args) {
		
		open();
		f1(100);
	}
	static void open() {
		System.out.println("문을 열기");
		System.out.println("바닥 청소");
		System.out.println("포스기켜");
		System.out.println("빵을 진열");
	}
	static void f1(int x) {
		System.out.println("x:"+x);
	}
}
