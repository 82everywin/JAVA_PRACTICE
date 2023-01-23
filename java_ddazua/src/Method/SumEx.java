package Method;

public class SumEx {
	public static void main(String[] args) {
		sum(10,20);
		sum(1.23,3.12);
		sum(10,20,30);
	}
	//메서드 명은 동일
	// 매개변수 갯수, 매개변수의 타입에 변화를 주는 것 => 오버로딩
	
	//메서드의 매개변수 타입에 변화
	static void sum(int x, int y ) {
		System.out.println(x+y);
	}
	static void sum(double x,double y) {
		System.out.println(x+y);
	}
	
	//메서드의 매개변수 갯수의 변화
	static void sum(int x,int y, int z) {
		System.out.println(x+y+z);
	}
}
