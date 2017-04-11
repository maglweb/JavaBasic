package Basic;

public class CastTest2 {

	public static void main(String[] args) {
		CastTest2 test2 = new CastTest2();
		Animal a = new Animal("name");
		Dog c = new Dog("dog", "blue");
		Bird b = new Bird("bird", "black");
		test2.f(a);
		test2.f(c);
		test2.f(b);
	}
	
	public void f(Animal a){
		System.out.println("name" + a.name);
		if(a instanceof Dog){
			Dog dog = (Dog)a;
			System.out.println(""+dog.eyesColor + "eyes");
		} else if (a instanceof Bird) {
			Bird bird = (Bird)a;
			System.out.println("" + bird.furColor + "fur");
		}
	}
}
