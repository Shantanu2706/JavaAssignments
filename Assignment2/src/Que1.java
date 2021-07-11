import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int salary = scanner.nextInt();
		int shifts = scanner.nextInt();
		boolean invalid = false;
		if(salary > 8000) {
			System.out.println("Salary too large");
			invalid = true;
		}else if(salary < 0) {
			System.out.println("Salary too small");
			invalid = true;
		}
		if(shifts < 0) {
			System.out.println("Shifts too small");
			invalid = true;
		}
		if(invalid) {
			return;
		}
		
		System.out.println(calculateSal(salary, shifts));
		

	}
	
	public static int calculateSal(int salary, int shifts) {
		int saving = salary/2;
		saving += (salary*2/100)*shifts;
		return saving;
	}

}
