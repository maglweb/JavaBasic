package Basic;

class Person1 {

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
}

class Student1 extends Person {
	private String School;

	public String getSchool() {
		return School;
	}
	
	public void setSchool(String school){
		this.School = school;
	}
}

public class Test{
	public static void main(String args[]){
		Student student = new Student();
		student.setSchool("清华");
		student.setName("Ma");
		
		System.out.println(student.getName());
		System.out.println(student.getSchool());
		System.out.println(student.getAge());
	}
}

