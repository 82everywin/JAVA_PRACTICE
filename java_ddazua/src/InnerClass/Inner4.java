package InnerClass;

public class Inner4 {
	public static void main(String[] args) {
		
		OuterClass outer = new OuterClass();
		System.out.println(outer.a);
		System.out.println(outer.b);
		System.out.println(OuterClass.b);//객체생성되지 않아도 ok
		
		//기본 생성자로 부름
		OuterClass outer2= new OuterClass();
		//기본 생성자 -> 클래스의 기본 생성자를 부름
		OuterClass.Inner i= new OuterClass().new Inner();
		// OuterClss.Inner i = outer2.new Inner();
		System.out.println(i.c);
		i.innerMethod();
		
		//static 이니까!
		// 클래스 내부의 생성자를 바로 부를 수 잇음. 
		// 이때 클래스는 static이 아니니까 new로 객체를 생성하고, staticInner()는 
		// new가 없어도 생성 가능( static이므로 객체생성x)
		OuterClass.StaticInner si =new OuterClass.StaticInner();
		System.out.println(si.d);
		si.staticMethod();
		
	}

}

class OuterClass{
	int a=3;
	static int b=4;
	
	class Inner { 
		int c=5;
		public void innerMethod() {
			System.out.println("<Inner Class>");
		}
	}
	
	static class StaticInner{
		int d=6;
		static int stat=10;
		
		public static void staticMethod() {
			System.out.println("<Static Inner>");
		}
	}
}