package Basic;

public interface Singer {
	public void sing(); // 唱歌方式不同，定义一个抽象方法

	public void sleep(); // 睡觉方式不同，定义一个抽象方法
}

class SingerStudent implements Singer { // implements实现接口里的抽象方法
	private String name;

	public SingerStudent(String name) {
		this.name = name;
	}

	public void study() {
		System.out.println("studying");
	}

	public String getName() {
		return name;
	}

	public void sing() {
		System.out.println("Sutdent is singing");
	}

	public void sleep() {
		System.out.println("student is sleeping");
	}
}
