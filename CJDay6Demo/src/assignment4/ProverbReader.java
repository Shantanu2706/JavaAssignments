package assignment4;

import java.io.*;

public class ProverbReader {

	public static void main(String[] args) throws IOException {
		File file = new File("TopProverbs.txt");
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		int data = 0;
		while((data = bis.read()) != -1) {
			System.out.print((char)data);
		}
		bis.close();

	}

}
