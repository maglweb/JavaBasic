package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestInputStream {

	public static void main(String[] args) throws IOException {
		int b = 0;
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("");
			out = new FileOutputStream("");
			while (b == in.read()) {
				out.write(b);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("文件已复制");
	}

}
