import java.util.Scanner;

public class Que8 {
	static int[] fedback = new int[100]; 
	static int j = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n < 0) {
			System.out.println("Invalid array size");
			return;
		}
		int[] m = new int[n];
		int[] h = new int[n];
		for(int i=0 ; i<n ; i++) {
			m[i] = sc.nextInt();
			if(m[i] < 0) {
				System.out.println("Invalid input");
				return;
			}
		}
		for(int i=0 ; i<n ; i++) {
			h[i] = sc.nextInt();
			if(m[i] < 0) {
				System.out.println("Invalid input");
				return;
			}
		}
		highestFeedBack(m,h,n);
		for(int i=0 ; i<j ; i++) {
			
			System.out.println(fedback[i]);
		}
		

	}
	
	public static void highestFeedBack(int[] m, int[] h, int size) {
		for(int i=0 ; i<size ; i+=2) {
			if(m[i] == h[i]) {
				fedback[j++] = m[i];
				fedback[j++] = Math.max(m[i+1],h[i+1]);
			}else {
				fedback[j++] = m[i];
				fedback[j++] = m[i+1];
				fedback[j++] = h[i];
				fedback[j++] = h[i+1];
			}
		}
	}

}
