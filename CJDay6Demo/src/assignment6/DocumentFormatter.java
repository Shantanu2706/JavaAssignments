package assignment6;

import java.io.*;
import java.util.Scanner;

public class DocumentFormatter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name: ");
		String fileName = sc.nextLine();
		File file = new File("Extraspaces.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		int data = 0;
		StringBuilder sb = new StringBuilder("");
		while((data = br.read()) != -1) {
			sb.append((char)data);
			if(data == 32) {
				while((data = br.read()) == 32) {
					continue;
				}
				sb.append((char)data);
			}else if(data == 10) {
				String str = sb.toString();
				FileOutputStream fos = new FileOutputStream(fileName,true);
				PrintWriter pr = new PrintWriter(fos);
				pr.write(str);
				pr.close();
				sb = new StringBuilder("");
			}
			
		}
		String str = sb.toString();
		FileOutputStream fos = new FileOutputStream(fileName,true);
		PrintWriter pr = new PrintWriter(fos);
		pr.write(str);
		pr.close();
		
		br.close();


	}

}
