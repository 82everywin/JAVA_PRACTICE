package Inheritance;

public class Leader extends Student {

	void lead() {
		
	}

	@Override
	void say() {
		// TODO Auto-generated method stub
		System.out.println("선생님께 인사!");
		super.say();
	}
	
}
