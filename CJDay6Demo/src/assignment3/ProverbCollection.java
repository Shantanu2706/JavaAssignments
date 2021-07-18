package assignment3;
import java.io.*;
import java.util.Scanner;

public class ProverbCollection {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Type");
		String str;
		while(!(str = sc.nextLine()).equals("STOP")) {
			storeProverb(str + "\n");
		}


	}
	
	public static void storeProverb(String proverb) throws IOException {
		FileOutputStream fos = new FileOutputStream("TopProverbs.txt",true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		byte[] info = proverb.getBytes();
		bos.write(info,0,proverb.length());
		bos.close();
	}

}
