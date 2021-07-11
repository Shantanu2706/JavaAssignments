
public class Que6c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 1;
		while(true) {
			int num3 = num1 + num2;
			if(num3 >= 1000) {
				break;
			}
			if((num3 % 2 == 0) && (num3 > 100)) {
				System.out.print(num3 + " ");
			}
			
			num1 = num2;
			num2 = num3;
		}

	}

}
