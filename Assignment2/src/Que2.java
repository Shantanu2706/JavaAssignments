import java.util.Arrays;
import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n < 0) {
			System.out.println("Invalid input");
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
		int count = 0;
		
		Arrays.sort(arr);
		for(int i=0 ; i<n-1 ;) {
			int j = i+1;
			boolean same = false;
			while(j<n && arr[i] == arr[j]) {
				j++;
				same = true;
			}
			if(same) {
				count += j-i;
			}
			
			i = j;
		}
		System.out.println(count);

	}

}
