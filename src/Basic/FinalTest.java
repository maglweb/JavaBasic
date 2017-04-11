package Basic;

//方法不想被重写
//可以修饰变量（不能被改变），方法（不能被重写）和类（不能被继承）

public class FinalTest {
	public static void main(String args[]){
		T t = new T();
		System.out.println(t.i);
	}
}

class T{
	final int i = 8; // 定以后不可被修改，只读
	public void m(final int j){
		// j = 9
	}
	
	public final void n(){
		
	}
}

