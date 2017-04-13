package List;

public class NumSort2 {

	public static void main(String[] args) {
		int[] sort = { 2, 4, 1, 3, 9, 6, 5, 8, 7 };
		print(sort);
		selectionSort(sort);
		print(sort);
	}

	private static void selectionSort(int[] a) {
		int k, temp;
		for (int i = 0; i < a.length; i++) {
			k = i;
			for (int j = k + 1; j < a.length; j++) {
				if (a[j] < a[k]) {
					k = j;
				}
			}
			if (k != i) {
				temp = a[i];
				a[i] = a[k];
				a[k] = temp;
			}
		}
	}

	private static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}
}
