package Basic;

// 继承中的构造方法
// 使用this(argument_list)调用本类的另外的构造方法
// 如果调用super，必须写在子类构造方法的第一行

class SuperClass {
	private int n;

	SuperClass() {
		System.out.println("SuperClass()");
	}

	SuperClass(int n) {
		System.out.println("SuperClass(" + n + ")");
		this.n = n;
	}
}

class SubClass extends SuperClass {

	private int n;

	SubClass(int n) {
		System.out.println("SubClass(" + n + ")");
		this.n = n;
	}

	SubClass() {
		super(300);
		System.err.println("SubClass()");
	}

}

public class TestSuperSub {

	public static void main(String[] args) {
		SubClass sc1 = new SubClass();
		System.out.println("-------");
		SubClass sc2 = new SubClass(300);
	}

}
