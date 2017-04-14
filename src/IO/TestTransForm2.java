package IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestTransForm2 {
	public static void main(String args[]) {
		try {
			FileInputStream in = new FileInputStream("");
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			String s = null;
			try {
				s = br.readLine();
				while (s != null) {
					if (s.equalsIgnoreCase("exit"))
						break;
					System.out.println(s.toUpperCase());
					s = br.readLine();
				}
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
