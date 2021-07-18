package assignment4;

import java.util.*;


public class TestAgeCalculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter DOB");
		String str = sc.nextLine();
		AgeCalculator2 age = new AgeCalculator2();
		
		
		try {
			int a = age.calculateAge(str);
			System.out.println(a);
		}catch(InvalidDOBException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("Date of birth should be in dd/mm/yyyy format");
		}
		

	}

}
