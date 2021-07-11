
public class Que6d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 1;
		int sum = 1;
		while(true) {
			int num3 = num1 + num2;
			if(num3 >= 100) {
				break;
			}
			sum += num3;
			num1 = num2;
			num2 = num3;
		}
		System.out.println(sum);

	}

}
