import java.util.Scanner;

public class Que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if(a < 0) {
			System.out.println("Invalid input");
			return;
		}
		int count = 0;
		while(a != 0) {
			count++;
			if(a >= 500) {
				a -= 500;
			}else if(a >= 100) {
				a -= 100;
			}else if(a >= 50) {
				a -= 50;
			}else if(a >= 10) {
				a -= 10;
			}else if(a >= 5) {
				a -= 5;
			}else if(a >= 1) {
				a -= 1;
			}
		}
		System.out.println(count);
		

	}

}
