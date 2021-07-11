import java.util.Scanner;

public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scanner = new Scanner(System.in);
				char alph = scanner.next().charAt(0);
				while(alph != 'z' && alph != 'Z') {
					System.out.print(alph + " ");
					
					alph++;
				}

				System.out.println(alph);
		
	}

}
