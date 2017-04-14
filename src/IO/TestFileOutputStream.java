package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {

	public static void main(String[] args) throws IOException {
		int b = 0;
		FileOutputStream out = null;
		FileInputStream in = null;
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
	}

}
