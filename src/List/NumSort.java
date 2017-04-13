package List;

public class NumSort {

	public static void main(String[] args) {
		int[] array = { 1, 3, 2, 9, 5, 4, 7, 6, 8 }; // args传几个参数就接受几个参数
		/*for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(a[i]); // 转换成int
		}*/
		print(array);
		SelectionSort(array);
		print(array);
	}

	// 选择排序
	private static void SelectionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	// 打印i的方法
	private static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		System.out.println();
	}
}
