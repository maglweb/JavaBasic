package Basic;

// 抽象类
public class AbstractClass {

}

abstract class AbstractClassTest {
	// 还有定义没有实现， 抽象方法需要被调用时重写，抽象方法没有实现所以所在的类被声明为抽象类
	// 抽象类就是用来被继承的，抽象类不能被实例化
	// 抽象类方法只需声明，不需实现
	public abstract void play();
}
