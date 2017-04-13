package StringClass;

public class TestStringClass1 {

	public static void main(String[] args) {
		String s = "Welcome to Java World";
		String s1 = "    sun java    ";
		System.out.println(s.startsWith("Welcome")); // true
		System.out.println(s.endsWith("world")); // false
		String sL = s.toLowerCase();
		String sU = s.toUpperCase();
		System.out.println(sL); // welcome to java world
		System.out.println(sU); // WELCOME TO JAVA WORLD
		String subS = s.substring(1);
		System.out.println(subS); // Java World
		String subs2 = s.substring(0, 2);
		System.out.println(subs2);
		String st = s1.trim();
		System.out.println(st); // sun java
		String sp = s1.replace("java", "jdk");
		System.out.println(sp);
	}

}
