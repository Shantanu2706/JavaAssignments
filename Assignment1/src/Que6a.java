
public class Que6a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 1;
		int count = 8;
		System.out.print(num1 + " " + num2 + " ");
		while(count-- > 0) {
			int num3 = num1 + num2;
			System.out.print(num3 + " ");
			num1 = num2;
			num2 = num3;
		}

	}

}
