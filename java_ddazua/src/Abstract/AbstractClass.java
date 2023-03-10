package Abstract;

public class AbstractClass {
	public static void main(String[] args) {
		
		Pokemon pokemon= new Pikachu(); //업캐스팅
		System.out.println("이 포켓몬은 : "+ pokemon.getName());
		pokemon.attack();
		pokemon.sound();
		pokemon=new Squirtle();
		System.out.println("이 포켓몬은 : "+ pokemon.getName());
		pokemon.attack();
		pokemon.sound();
		/*
		Pokemon pikachu= new Pikachu();
		System.out.println("이 포켓몬은 : "+ pikachu.getName());
		pikachu.attack();
		pikachu.sound();
		Pokemon squirtle= new Squirtle();
		System.out.println("이 포켓몬은 : "+ squirtle.getName());
		squirtle.attack();
		squirtle.sound();
		*/
	}
}

abstract class Pokemon {
	String name;
	abstract void attack();
	abstract void sound();
	public String getName()	{
		return this.name=name;
	}
}

class Pikachu extends Pokemon{

	Pikachu () {
		this.name="피카츄";
	}
	
	@Override
	void attack() {
		System.out.println("전기 공격!");
	}

	@Override
	void sound() {
		System.out.println("피카피카!");
	}
	
	
}

class Squirtle extends Pokemon {
	Squirtle () {
		this.name = "꼬북이";
	}

	@Override
	void attack() {
		System.out.println("물 공격!");
	}

	@Override
	void sound() {
		System.out.println("꼬북 꼬북!");
	}
	
}