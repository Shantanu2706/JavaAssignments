import java.util.Scanner;

public class Que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n < 0) {
			System.out.println("Invalid array size");
			return;
		}
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++) {
			arr[i] = scanner.nextInt();
			if(arr[i] < 0) {
				System.out.println("Invalid input");
				return;
			}
		}
		int s = scanner.nextInt();
		if(s < 0) {
			System.out.println("Invalid score");
			return;
		}
		int[] output = new int[n];
		int j=0;
		for(int i=1 ; i<n ; i+=2) {
			if(s < arr[i]) {
				output[j++] = arr[i-1];
			}
		}
		for(int i=0 ; i<j ; i++) {
			System.out.println(output[i]);
		}
		

	}

}
