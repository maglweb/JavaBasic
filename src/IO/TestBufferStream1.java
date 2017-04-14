package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestBufferStream1 {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream in = new FileInputStream("");
			BufferedInputStream bis = new BufferedInputStream(in);
			int c = 0;
			System.out.println(bis.read());
			bis.mark(100); // 从第100个字符往外读
			for (int i = 0; i <= 10; i++) {
				System.out.println(c + "");
			}
			System.out.println();
			bis.reset();
			for (int i = 0; i <= 10; i++) {
				System.out.println(c + "");
			}
			bis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
