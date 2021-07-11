import java.util.Scanner;

public class Que10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n < 0) {
			System.out.println("Invalid input");
			return;
		}
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] < 0) {
				System.out.println("Invalid input");
				return;
			}
		}
		int ele = sc.nextInt();
		int count = findElementCount(arr, n, ele);
		System.out.println(count);

	}
	
	public static int findElementCount(int[] arr, int size, int ele) {
		int count = 0;
		for(int i=0 ; i<size ; i++) {
			if(arr[i] == ele) {
				count++;
			}
		}
		return count;
	}

}
