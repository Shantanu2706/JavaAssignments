import java.util.Scanner;

public class Que9 {
	static int count = 0;

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
		int sum = primeIndexSum(arr,n);
		System.out.println(sum/count);

	}
	
	public static int primeIndexSum(int[] arr, int size) {
		int sum = 0;
		for(int i=1 ; i<=size ; i++) {
			if(isPrime(i)) {
				sum += arr[i-1];
				count++;
			}
		}
		return sum;
	}
	
	public static boolean isPrime(int num) {
		if(num <= 1) {
			return false;
		}
		for(int i=2 ; i<num ; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}

}
