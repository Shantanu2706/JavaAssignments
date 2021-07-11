import java.util.Scanner;

public class Que9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum = 0;
		while(num != 0) {
			int rem = num % 10;
			sum += rem;
			num /= 10;
		}
		System.out.println(sum);

	}

}
