package Inheritance;

public class ObjectTestOverride {
	public static void main(String[] args) {
		Bclass b1=new Bclass();
		Bclass b2=new Bclass();
		System.out.println(b1);
		System.out.println(b1.toString());
		System.out.println(b1.equals(b2));
	}

}

class Bclass{
	public String toString() {
		return "Bclass 객체";
	}
	
	public boolean equals(Object obj) {
		return true;
	}
}