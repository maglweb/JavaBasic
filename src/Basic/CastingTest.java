package Basic;

class Animal {
	public String name;

	public Animal(String name) {
		this.name = name;
	}

	public void enjoy() {
		System.out.println("叫声...");
	}
}

class Dog extends Animal {
	public String eyesColor;

	public Dog(String n, String c) {
		super(n);
		this.eyesColor = c;
	}
}

class Bird extends Animal {
	public String furColor;

	public Bird(String n, String c) {
		super(n);
		this.furColor = c;
	}
}

class Lady {
	private String name;
	private Animal pet;

	public Lady(String name, Animal pet) {
		this.name = name;
		this.pet = pet;
	}

	public void myPetEnjoy() {
		pet.enjoy();
	}
}

public class CastingTest {
	public static void main(String args[]) {
		Animal a = new Animal("name");
		Dog d = new Dog("dogname", "black");
		Bird b = new Bird("Birdname", "blue");

		System.out.println(a instanceof Animal);
		System.out.println(b instanceof Animal);
		// Dog d1 = (Dog)a;
		// System.out.println(d1.eyesColor);
	}
}
