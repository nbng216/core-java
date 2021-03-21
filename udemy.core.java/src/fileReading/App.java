package fileReading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {

		BufferedReader br = null;
		File file = new File("D:\\eclipse\\udemy.core.java\\src\\fileReading\\nbn.txt");

		try {

			br = new BufferedReader(new FileReader(file));
			String line;
			System.out.println(file.getAbsolutePath());
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			//System.out.println("file not found: " + file.toString());
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
