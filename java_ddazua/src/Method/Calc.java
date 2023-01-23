package Method;

// 두 수를 전달받아 사칙연산 구현 하기 (단, 정수 실수 모두 가능) 
public class Calc {
	public static void main(String[] args) {
		sum(10,20);
		sum(10.0,20.0);
		sub(10,20);
		sub(5.0,2.0);
		mul(10,20);
		mul(7.0,3.0);
		div(10,2);
		div(10.0,5.0);
		System.out.println("---문자형---");
		System.out.println(sum("Hello","World"));
		
	}
	static void sum(int x, int y) {
		System.out.println(x+y);
	}
	static void sum(double x, double y) {
		System.out.println(x+y);
	}
	
	static void sub(int x, int y) {
		System.out.println(x-y);
	}
	static void sub(double x, double y) {
		System.out.println(x-y);
	}
	static void mul(int x, int y) {
		System.out.println(x*y);
	}
	static void mul(double x, double y) {
		System.out.println(x*y);
	}
	static void div(int x, int y) {
		System.out.println(x/y);
	}
	static void div(double x, double y) {
		System.out.println(x/y);
	}
	
	//문자형의 덧셈연산
	static String sum(String x, String y) { return x+y;}
}
