import java.util.Scanner;

public class Que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int result = productDigits(num);
		if(result == -1) {
			System.out.println("Invalid Input");
		}else {
			System.out.println(result);
		}

	}
	
	public static int productDigits(int num) {
		if(num < 0 || num > 32767) {
			return -1;
		}
		int result = 1;
		while(num != 0) {
			int rem = num%10;
			result *= rem;
			num /= 10;
		}
		return result;
	}

}
