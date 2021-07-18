package assignment1;
import java.io.*;

public class TestFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File badminton = new File("D:\\Badminton");
		badminton.mkdir();
		File singles = new File(badminton,"singles.txt");
		singles.createNewFile();
		File dubbles = new File(badminton,"dubbles.txt");
		dubbles.createNewFile();
		File courts = new File(badminton,"courts");
		courts.mkdir();
		File smash = new File(courts,"smash.dat");
		smash.createNewFile();		
		File doubles = new File(badminton,"doubles.txt");
		dubbles.renameTo(doubles);
		singles.delete();

	}

}
