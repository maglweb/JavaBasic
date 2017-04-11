package Basic;

public interface InterfaceTest {
	public static final int id = 1;
	public void start();
	public void run();
	public void stop();  // 接口里的方法不用写abstract，接口里的所有方法都是abstract
}

// 接口可以多重实现
// 接口中声明的属性默认为public staitc final
// 接口里的方法都是public 的