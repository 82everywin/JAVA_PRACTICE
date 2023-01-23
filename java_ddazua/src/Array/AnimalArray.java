package Array;

public class AnimalArray {

	public static void main(String[] args) {
		Animal ani[]=new Animal[3];
		
		for(int i=0;i<3;i++) {
		ani[i]=new Animal();
		}
		
		ani[0].kind="고양이";
		ani[0].name="나르";
		ani[0].age =1;
		
		ani[1].kind="강아지";
		ani[1].name="나쵸";
		ani[1].age =3;
		
		ani[2].kind="고양이";
		ani[2].name="초쿄";
		ani[2].age =2;
		
		for(int i =0;i<3;i++) {
			System.out.println("["+ani[i].kind+"] ------");
			ani[i].Info();
		}
	}
}

class Animal{
	String kind;
	String name;
	int age;
	
	void Info( ) {
		System.out.println("kind :"+kind);
		System.out.println("name :"+name);
		System.out.println("age :"+age);
	}
}
