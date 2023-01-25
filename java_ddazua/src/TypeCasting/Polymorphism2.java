package TypeCasting;

public class Polymorphism2 {

	public static void main(String[] args) {
		Animal lion = new Lion(); // 업캐스팅
		lion.breath();
		
		//lion.cry(); //Animal로 업캐스팅을 했기 때문에 lion의 메서드 사용 할 수 X 
		System.out.println(lion.toString());
		
		Lion lion1=(Lion)lion; //다운캐스팅
		lion1.cry(); // lion의 메서드를 사용할 수 있게 됨!
		
		ZooKeeper zk = new ZooKeeper();
		zk.feed(lion);
		
		Animal rabbit = new Rabbit();
		zk.feed(rabbit);
		
		Monkey monkey = new Monkey();
		zk.feed(monkey);
	}
}

class Animal{
	void breath() {
		System.out.println("숨쉬기!");
	}
}

class Lion extends Animal{
	public String toString() {
		return "사자";
	}
	public void cry() {
		System.out.println("어흥 소리를 낸다.");
	}
}
class Rabbit extends Animal{
	public String toString() {
		return "토끼";
	}
}
class Monkey extends Animal{
	public String toString() {
		return "원숭이";
	}
}

class ZooKeeper{
	void feed(Animal animal) {
		System.out.println(animal+"에게 먹이 주기");
	}
}
