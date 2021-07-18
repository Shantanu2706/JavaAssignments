package assignment1;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result = num1/num2;
			System.out.println(result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("No Input received");
		}catch(NumberFormatException e) {
			System.out.println("Only Integers are allowed");
		}catch(ArithmeticException e) {
			System.out.println("Division with zero is not possible");
		}
		

	}

}
