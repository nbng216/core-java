package writingFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFileTest {
	
	public static void main(String[] args) {
		
		File fl = new File("D:\\eclipse\\udemy.core.java\\src\\writingFiles\\nbn.txt");
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(fl))){
			System.out.println(fl.getAbsolutePath());
			
			bw.write("this is first line");
			
			bw.newLine();
			
			bw.write("this is new second line");
			
		} catch (IOException e) {
			System.out.println("cannot write to file");
		}
		}
	}


