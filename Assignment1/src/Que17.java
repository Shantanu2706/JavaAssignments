
public class Que17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		if(n <= 1) {
			System.out.println("Not prime");
			return;
		}
		for(int i=2 ; i<n ; i++) {
			if(n%i == 0) {
				System.out.println("Not prime");
				return;
			}
		}
		System.out.println("Prime");

	}

}
