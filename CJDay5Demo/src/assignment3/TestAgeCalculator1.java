package assignment3;

import java.util.Scanner;

public class TestAgeCalculator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter DOB");
		String str = sc.nextLine();
		AgeCalculator1 age = new AgeCalculator1();
		
		
		try {
			int a = age.calculateAge(str);
			System.out.println(a);
		}catch(Exception e) {
			System.out.println("Date of birth should be in dd/mm/yyyy format");
		}
		

	}

}
