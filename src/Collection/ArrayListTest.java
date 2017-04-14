package Collection;

import java.util.Collection;

public class ArrayListTest {

	public static void main(String[] args) {
		Collection c = (Collection) new ArrayListTest();
		// 可以放入不同类型的对象
		c.add("hello");
		System.out.println(c.size());
		System.out.println(c);
	}

}
