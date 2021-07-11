import java.util.Scanner;

public class Que7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		if(f < 0) {
			System.out.println("Invalid Input");
			return;
		}
		double c = (f - 32)*5/9;
		System.out.format("%.2f", c);

	}

}
