import java.util.Scanner;

import com.zubiri.dni.DNI;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		DNI dni = new DNI();

		boolean notSetted = true;

		while (notSetted) {
			
			System.out.println("Please enter the dni");
			
			String possibleDni=sc.next();
			sc.nextLine();

			try {

				dni.setDni(possibleDni);
				
				notSetted = false;

			} catch (Exception e) {

				System.out.println("Unable to set DNI");

			}

		}

		System.out.println(dni.getDni());

	}

}
