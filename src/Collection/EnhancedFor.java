package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class EnhancedFor {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		for (int i : arr){
			System.out.println(i);
		}
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		for (Object o : c){
			System.out.println(o);
		}
	}

}
