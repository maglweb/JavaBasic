package List;


public class TestArray {
	public static void main(String args[]) {
		int[] a = { 2, 4, 6, 7, 3, 5, 1, 9, 8 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0;j < a.length -i -1;j ++){
				if(a[j] < a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			System.out.println();
		}
	}
}
