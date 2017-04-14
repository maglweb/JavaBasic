package Collection;

import java.util.ArrayList;
import java.util.List;

public class BasicGeneric {
	public static void main(String args[]) {
		List<String> c = new ArrayList<String>();
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		for (int i = 0; i < c.size(); i++) {
			String s = c.get(i);
			System.out.println(s);
		}
	}
}

class MyName implements Comparable<MyName> {

	int age;

	@Override
	public int compareTo(MyName mn) {
		if (this.age > mn.age)
			return -1;
		else if (this.age < mn.age) {
			return -1;
		} else {
			return 0;
		}
	}

}