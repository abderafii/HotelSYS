package Hotel;

import java.util.Scanner;

public class laundry {
	int laundrytotalprice = 0;
	int choice = 0;
	char continuation = 'y';
	int numbofPants = 0;
	int numbofShirts = 0;
	int numbofSuits = 0;
	int numbofShoes = 0;
	int numbofSheets = 0;
	int numbofBlankets = 0;
	int numbofTowels = 0;
	
	Scanner scanner = new Scanner(System.in);
	
public int calctotalprice() {
	choice = 0;
	continuation = 'y';
	numbofPants = 0;
	numbofShirts = 0;
	numbofSuits = 0;
	numbofShoes = 0;
	numbofSheets = 0;
	numbofBlankets = 0;
	numbofTowels = 0;
	laundrytotalprice = 0;
	
	while(choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6 && choice != 7) {
		while(continuation == 'y' || continuation == 'Y') {
			
			System.out.println("\nPlease choose a laundry option from the following menu:");
			System.out.println("----------------Games Menu--------------");
			System.out.println("1. Pants: 20 MAD");
			System.out.println("2. T-Shirt: 15 MAD");
			System.out.println("3. Suit: 100 MAD");
			System.out.println("4. Shoes: 60 MAD");
			System.out.println("5. Sheets: 70 MAD");
			System.out.println("6. Blanket: 50 MAD");
			System.out.println("7. Towel: 10 MAD");
			System.out.println("----------------------------------------");
			System.out.print("Your choice: ");
			choice = scanner.nextInt();
			
			if (choice == 1) {
				laundrytotalprice = laundrytotalprice + 20;
				numbofPants++;
			} else if (choice == 2) {
				laundrytotalprice = laundrytotalprice + 15;
				numbofShirts++;
			} else if (choice == 3) {
				laundrytotalprice = laundrytotalprice + 100;
				numbofSuits++;
			} else if (choice == 4) {
				laundrytotalprice = laundrytotalprice + 60;
				numbofShoes++;
			} else if (choice == 5) {
				laundrytotalprice = laundrytotalprice + 70;
				numbofSheets++;
			}else if (choice == 6) {
				laundrytotalprice = laundrytotalprice + 50;
				numbofBlankets++;
			} else if (choice == 7) {
				laundrytotalprice = laundrytotalprice + 10;
				numbofTowels++;
			} else {
				System.out.println("Error! Please choose a valid laundry option");
			}
			
			if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6 || choice == 7) {
				System.out.println("Would you like to order another item? ");
				System.out.print("Type y for yes or n for no: ");
				continuation = scanner.next().charAt(0);
			}
		}
	}
		
		return laundrytotalprice;
	}

	public void laundrybill() {
		System.out.println("\n-------------Laundry Bill------------");
		System.out.format("%-16s %-13s %-13s %-13s", "Item", "Quantity", "P.U", "Total Price");
		if (numbofPants > 0) {
			System.out.format("\n%-16s %-13s %-13s %-13s", "Pants", numbofPants, 20, numbofPants*20);
		}
		if (numbofShirts > 0) {
			System.out.format("\n%-16s %-13s %-13s %-13s", "Shirts", numbofShirts, 15, numbofShirts*15);
		}
		if (numbofSuits > 0) {
			System.out.format("\n%-16s %-13s %-13s %-13s", "Suits", numbofSuits, 100, numbofSuits*100);
		}
		if (numbofShoes > 0) {
			System.out.format("\n%-16s %-13s %-13s %-13s", "Shoes", numbofShoes, 60, numbofShoes*60);
		}
		if (numbofSheets > 0) {
			System.out.format("\n%-16s %-13s %-13s %-13s", "Sheets", numbofSheets, 70, numbofSheets*70);
		}
		if (numbofBlankets > 0) {
			System.out.format("\n%-16s %-13s %-13s %-13s", "Blankets", numbofBlankets, 50, numbofBlankets*50);
		}
		if (numbofTowels > 0) {
			System.out.format("\n%-16s %-13s %-13s %-13s", "Towels", numbofTowels, 10, numbofTowels*10);
		}
		System.out.format("\n\n%50s: %1s MAD", "Total", laundrytotalprice);
	}

}
