import java.util.Scanner;

public class Que14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int num = n;
		int dig = 0;
		while(num != 0) {
			dig++;
			num /= 10;
		}
		num = n;
		int sum = 0;
		while(n != 0) {
			int rem = n % 10;
			sum += Math.pow(rem, dig);
			n /= 10;
		}
		if(num == sum) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not Armstrong number");
		}
		

	}

}
