import java.util.Scanner;

public class Que11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n < 0) {
			System.out.println("Number too small");
		}else if(n > 32767) {
			System.out.println("Number too large");
		}else {
			if(n == 0) {
				System.out.println("No");
			}else {
				while(n != 1) {
					if(n%2 != 0) {
						System.out.println("No");
						return;
					}
					n = n/2;
				}
				System.out.println("Yes");
			}
		}

	}

}
