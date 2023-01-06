package Hotel;

import java.util.Scanner;

public class Main {
	static int roomtot;
	static int restaubill;
	static int total;
	static int gametot;
	static int laundrytot;
	
	public static void main(String[] args) {
		
		int Choice = 0;
		
		user_info user = new user_info();
		roompricecalc roompricecalc = new roompricecalc();
		restaurantbill restbill = new restaurantbill();
		games game = new games();
		laundry laund = new laundry();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the Hotel Management System!");
		System.out.println("We would like to help you know all your "
				+ "expenses throughout your stay in the Hotel, but first\nyou have to fill some"
				+ " personal information.\n");
		
		user.fillinfo();
		
		while(Choice != 6) {
			System.out.println("\n\nPlease choose an option from the available services ");
			System.out.println("1. Generate New Room Rent Bill");
			System.out.println("2. Generate New Restaurant Bill ");
			System.out.println("3. Generate New Laundry Bill ");
			System.out.println("4. Generate New Games Bill ");
			System.out.println("5. Generate Total Cost Bill");
			System.out.println("6. Exit ");
			System.out.print("Your choice: ");
			Choice = scanner.nextInt();
			
			if (Choice == 1) {
				roomtot = roompricecalc.calctotalprice();
				roompricecalc.roombill();
			}

			else if (Choice == 2) {
				restaubill = restbill.calctotalprice();
				restbill.restaubill();
			}
			
			
			else if (Choice == 3) {
				laundrytot = laund.calctotalprice();
				laund.laundrybill();
			}
			
			
			else if (Choice == 4) {
				gametot = game.calctotalprice();
				game.gamesbill();
			}
			
			else if (Choice == 5) {
				user.printinfo();
				roompricecalc.roombill();
				restbill.restaubill();
				laund.laundrybill();
				game.gamesbill();
				total = roomtot + restaubill+ gametot+ laundrytot;
				System.out.println("\n\nThe total amount to be paid is : "+total+" MAD");
			}
			
			else if (Choice == 6) {
				System.out.println("\n\nThank you for using this program. Exiting....");
				System.exit(-1);
			}
			
			else {
				System.out.println("Error! Please choose a valid option! ");
			}
		}
		
		scanner.close();
		
	}

}
