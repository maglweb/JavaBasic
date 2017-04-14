package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TestTransForm1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream out;
		try {
			out = new FileOutputStream("");
			OutputStreamWriter osw = new OutputStreamWriter(out); // 把字节转换成字符
			osw.write("aaaa");
			osw.flush();
			osw = new OutputStreamWriter(new FileOutputStream("", true),
					"ISO8859_1");
			osw.write("asdfasdf");
			System.out.println(osw.getEncoding());
			osw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
