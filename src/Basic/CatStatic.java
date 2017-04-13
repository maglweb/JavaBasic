package Basic;

public class CatStatic {
	private static int age;
	private int sid = 0;
	private String name;
	int id;

	public CatStatic(String name) {
		this.name = name;
		id = sid++;
	}

	public void info() {
		System.out.println("My name is " + name + "No." + sid);
	}

	public static void main(String args[]) {
		CatStatic mimi = new CatStatic("mimi");
		CatStatic pipi = new CatStatic("pipi");
		mimi.info();
		pipi.info();
	}
}
