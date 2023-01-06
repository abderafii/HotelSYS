package Hotel;

import java.util.Scanner;

public class restaurantbill {
	int resbilltotalprice = 0;
	int choice = 0;
	char continuation = 'y';
	int numboftacos = 0;
	int numbofsalad = 0;
	int numbofsoda = 0;
	int numbofbeef = 0;
	int numbofsushi = 0;
	int numbofpizza = 0;
	
	Scanner scanner = new Scanner(System.in);
	
public int calctotalprice() {
	choice = 0;
	continuation = 'y';
	numboftacos = 0;
	numbofsalad = 0;
	numbofsoda = 0;
	numbofbeef = 0;
	numbofsushi = 0;
	numbofpizza = 0;
	resbilltotalprice = 0;
	
	while(choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6) {
		while(continuation == 'y' || continuation == 'Y') {
			
			System.out.println("\nPlease choose an item from the following menu:");
			System.out.println("----------------Restaurant Menu--------------");
			System.out.println("1. Tacos: 30 MAD");
			System.out.println("2. Salad: 15 MAD");
			System.out.println("3. Soda: 8 MAD");
			System.out.println("4. Beef Tagin: 80 MAD");
			System.out.println("5. Sushi: 150 MAD");
			System.out.println("6. Pizza: 50 MAD");
			System.out.println("---------------------------------------------");
			System.out.print("Your choice: ");
			choice = scanner.nextInt();
			
			if (choice == 1) {
				resbilltotalprice = resbilltotalprice + 30;
				numboftacos++;
			} else if (choice == 2) {
				resbilltotalprice = resbilltotalprice + 15;
				numbofsalad++;
			} else if (choice == 3) {
				resbilltotalprice = resbilltotalprice + 8;
				numbofsoda++;
			} else if (choice == 4) {
				resbilltotalprice = resbilltotalprice + 80;
				numbofbeef++;
			} else if (choice == 5) {
				resbilltotalprice = resbilltotalprice + 150;
				numbofsushi++;
			} else if (choice == 6) {
				resbilltotalprice = resbilltotalprice + 50;
				numbofpizza++;
			} else {
				System.out.println("Error! Please choose a valid menu item");
			}
			
			if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6) {
				System.out.println("Would you like to order another item? ");
				System.out.print("Type y for yes or n for no: ");
				continuation = scanner.next().charAt(0);
			
			}
		}
	}
		
		return resbilltotalprice;
	}

	public void restaubill() {
		System.out.println("\n-----------Restaurant Bill-----------");
		System.out.format("%-16s %-13s %-13s %-13s", "Item", "Quantity", "P.U", "Total Price");
		if (numboftacos > 0) {
			System.out.format("\n%-16s %-13s %-13s %-13s", "Tacos", numboftacos, 30, numboftacos*30);
		}
		if (numbofsalad > 0) {
			System.out.format("\n%-16s %-13s %-13s %-13s", "Salad", numbofsalad, 15, numbofsalad*15);
		}
		if (numbofsoda > 0) {
			System.out.format("\n%-16s %-13s %-13s %-13s", "Soda", numbofsoda, 8, numbofsoda*8);
		}
		if (numbofbeef > 0) {
			System.out.format("\n%-16s %-13s %-13s %-13s", "Beef Tagin", numbofbeef, 80, numbofbeef*80);
		}
		if (numbofsushi > 0) {
			System.out.format("\n%-16s %-13s %-13s %-13s", "Sushi", numbofsushi, 150, numbofsushi*150);
		}
		if (numbofpizza > 0) {
			System.out.format("\n%-16s %-13s %-13s %-13s", "Pizza", numbofpizza, 50, numbofpizza*50);
		}
		System.out.format("\n\n%50s: %1s MAD", "Total", resbilltotalprice);
	}
	
}
