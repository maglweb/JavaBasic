package Basic;

class Person {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getinfo() {
		return "name" + getName() + "age" + getAge();
	}
}

class Student extends Person {
	private String School;

	public String setSchool(String school) {
		return this.School = school;
	}

	public String getSchool() {
		return School;
	}

	public String getInfo() {
		return "Name" + getName() + "school" + getSchool();
	}
}

public class TestOverWrite {
	public static void main(String args[]) {
		Student student = new Student();
		Person person = new Person();
		person.setAge(100);
		person.setName("Mick");
		student.setAge(45);
		student.setName("John");
		student.setSchool("SCH");
		System.out.println(person.getinfo());
		System.out.println(student.getInfo());
	}
}
