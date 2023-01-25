package AccessModifier;

public class StaticModifier {
	
	public static void main(String[] args) {
		
		
		System.out.println(sp.num);
		sp.say();
	}

}

class sp{
	public static int num=3;
	public static void say() {
		System.out.println("인스턴스를 생성하지 않고도 사용 가능함!");
	}
}