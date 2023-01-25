package AccessModifier;

public class FinalModifier {
	public static void main(String[] args) {
		Finalclass fc=new Finalclass();
		System.out.println(fc.num);
		// fc.num=3;  // final 변수는 변경할 수 없는 상수!
	}
}

 final class Finalclass {
	 final int num=4;
 }
 
 class Parents {// extends Finalclass//{//final클래스는 상속 불가!!
	 final void finalMethod() {
		 System.out.println("상속불갛ㄴ 메서드 ");
	 }
 }

 class Son extends Parents{
	 // void finalMethod(){} //메서드 오버라이딩 불가!!
 }