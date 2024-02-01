package zxc;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {

	public static void main(String[] args) {
		final String file = "./resource/1.txt";
		
		try (Reader r = new FileReader(file)){
			 System.out.println(r.read());
			 System.out.println((char)97);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
