package Class;

public class Class_practice_3 {
	public static void main(String[] args) {
		
		System.out.println(Cars.wheel);
		
		Cars mycar1 = new Cars();
		Cars mycar2 = new Cars
				();
		
		System.out.println("mycar1의 바퀴 수"+ mycar1.wheel);
		System.out.println("mycar2이 속력 :"+mycar2.speed);
		
		System.out.println("<변경 전>");
		System.out.println("mycar1.speed :"+mycar1.speed);
		System.out.println("mycar2.speed :"+mycar2.speed);
		System.out.println("mycar1.speed :"+mycar1.wheel );
		System.out.println("mycar2.speed :"+mycar2.wheel);
	
	    System.out.println("<변경 후>");
	    System.out.println("mycar1.speed :"+ mycar1.speed);
	    mycar2.speed=100;
	    System.out.println("mycar2.speed :"+mycar2.speed);
	    Cars.wheel=5;
	    System.out.println("mycar1.wheel :"+mycar1.wheel);
	    System.out.println("mycar2.wheel :"+mycar2.wheel);
	}
}

class Cars{
	static int wheel =4; //클래스 변수 
	int speed;	// 인스턴스 변수 
}