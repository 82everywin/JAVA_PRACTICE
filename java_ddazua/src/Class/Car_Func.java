package Class;

public class Car_Func {
	public static void main(String[] args) {
		Car mycar1= new Car();
		Car mycar2=new Car();

		mycar1.color="red";
		System.out.println("mycar1의 색 : "+ mycar1.color);
		mycar2.color="black";
		System.out.println("mycar2의 색 : "+ mycar2.color);
		System.out.println();
		
		mycar1.speedUp();
		System.out.println("mycar1의 속도 : "+ mycar1.speed);
		
		System.out.println("mycar2의 속도 : "+mycar2.speed);
		
		System.out.println("mycar1의 와이퍼 작동 여부 : "+ mycar1.wiperOn);
		
		mycar2.wiper();
		System.out.println("mycar2의 와이퍼 작동 여부 : "+mycar2.wiperOn);
		
	}
	
	
}
