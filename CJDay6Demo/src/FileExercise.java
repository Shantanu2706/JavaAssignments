import java.io.*;

public class FileExercise {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name = "ShantanuP";
		byte[] info = name.getBytes();
		
		File file = new File("myFile");
		FileOutputStream fos = new FileOutputStream(file);
		int i = 5;
		while(i-- > 0) {
			fos.write(info);
		}
		
		File copied = new File("copiedFile");
		FileInputStream fis = new FileInputStream(file);
		fos.close();
		fos = new FileOutputStream(copied);
		int data = 0;
		while((data = fis.read()) != -1) {
			fos.write((char)data);
		}
		
		
		fos.close();
		fis.close();
	}

}
