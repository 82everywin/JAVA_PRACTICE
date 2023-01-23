package Class;

public class PhoneConstructor {
public static void main(String[] args) {
	IPhone myphone=new IPhone();
	IPhone iphone=new IPhone("iphone 13","sliver",256);
	System.out.println(iphone.capacity);
	iphone.Info();
	}
}

class IPhone {
	String model;
	String color;
	int capacity;
	
	public IPhone(){ //기본 생성자
	}
	
	public IPhone(String model,String color,int capacity){
		this.model=model;
		this.color=color;
		this.capacity=capacity;
	}
	
	void Info() {
		System.out.println("model :"+model);
		System.out.println("color :"+color);
		System.out.println("capacity :"+capacity);
	}
}
