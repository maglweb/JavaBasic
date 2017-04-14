package Collection;

import java.util.Set;

public class HashSet {

	public static void main(String[] args) {
		Set s1 = (Set) new HashSet();
		Set s2 = (Set) new HashSet();
		s1.add("a");s1.add("b");s1.add("c");
		s2.add("b");s2.add("d");s2.add("a");
		// set和list容器都具有Constructor
		// 构造方法用以初始化容器类
		Set sn = (Set)new HashSet();
	}

}
