import java.util.Scanner;

public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n < 0) {
			System.out.println("Invalid array size");
			return;
		}
		int[] arr = new int[n];
		int osum = 0;
		int esum = 0;
		for(int i=0 ; i<n ; i++) {
			arr[i] = scanner.nextInt();
			if(arr[i] < 0) {
				System.out.println("Invalid input");
				return;
			}else {
				if(arr[i]%2 == 0) {
					esum += arr[i];
				}else {
					osum += arr[i];
				}
			}
		}
		System.out.println(Math.max(osum, esum));
		
		
		

	}

}
