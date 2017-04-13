package List;

public class Count3Quit {

	public static void main(String[] args) {
		boolean[] arr = new boolean[500];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = true;
		}
		int leftCount = arr.length; // 剩余的人数

		int countNum = 0; // 变量值模拟计数器

		int index = 0; // 从位置0开始数

		while (leftCount > 1) {
			if (arr[index] = true) {
				countNum++;
				if (countNum == 3) {
					countNum = 0;
					arr[index] = false;
					leftCount--;
				}
			}

			index++;

			if (index == arr.length) {
				index = 0;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == true) {
				System.out.println(i);
			}
		}
	}
}
