package Hotel;

import java.util.Scanner;

public class games {
	int gamestotalprice = 0;
	int choice = 0;
	char continuation = 'y';
	int numbofBoardgames = 0;
	int numbofPoker = 0;
	int numbofBJack = 0;
	int numbofRoulette = 0;
	int numbofBingo = 0;
	
	Scanner scanner = new Scanner(System.in);
	
public int calctotalprice() {
	choice = 0;
	continuation = 'y';
	numbofBoardgames = 0;
	numbofPoker = 0;
	numbofBJack = 0;
	numbofRoulette = 0;
	numbofBingo = 0;
	gamestotalprice = 0;
	
	while(choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 ) {
		while(continuation == 'y' || continuation == 'Y') {
			
			System.out.println("\nPlease choose a game from the following menu:");
			System.out.println("----------------Games Menu--------------");
			System.out.println("1. Board Games: 50 MAD");
			System.out.println("2. Poker: 150 MAD");
			System.out.println("3. Black Jack: 100 MAD");
			System.out.println("4. Roulette: 40 MAD");
			System.out.println("5. Bingo: 150 MAD");
			System.out.println("----------------------------------------");
			System.out.print("Your choice: ");
			choice = scanner.nextInt();
			
			if (choice == 1) {
				gamestotalprice = gamestotalprice + 50;
				numbofBoardgames++;
			} else if (choice == 2) {
				gamestotalprice = gamestotalprice + 150;
				numbofPoker++;
			} else if (choice == 3) {
				gamestotalprice = gamestotalprice + 100;
				numbofBJack++;
			} else if (choice == 4) {
				gamestotalprice = gamestotalprice + 40;
				numbofRoulette++;
			} else if (choice == 5) {
				gamestotalprice = gamestotalprice + 150;
				numbofBingo++;
			} else {
				System.out.println("Error! Please choose a valid game");
			}
			if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5) {
				System.out.println("Would you like to order another item? ");
				System.out.print("Type y for yes or n for no: ");
				continuation = scanner.next().charAt(0);
			}
		}
	}
		
		return gamestotalprice;
	}

	public void gamesbill() {
		System.out.println("\n--------------Games Bill-------------");
		System.out.format("%-16s %-13s %-13s %-13s", "Item", "Quantity", "P.U", "Total Price");
		if (numbofBoardgames > 0) {
			System.out.format("\n%-16s %-13s %-13s %-13s", "Board Games", numbofBoardgames, 50, numbofBoardgames*50);
		}
		if (numbofPoker > 0) {
			System.out.format("\n%-16s %-13s %-13s %-13s", "Poker Games", numbofPoker, 150, numbofPoker*150);
		}
		if (numbofBJack > 0) {
			System.out.format("\n%-16s %-13s %-13s %-13s", "Black Jack Games", numbofBJack, 100, numbofBJack*100);
		}
		if (numbofRoulette > 0) {
			System.out.format("\n%-16s %-13s %-13s %-13s", "Roulette Games", numbofRoulette, 40, numbofRoulette*40);
		}
		if (numbofBingo > 0) {
			System.out.format("\n%-16s %-13s %-13s %-13s", "Bingo Games", numbofBingo, 150, numbofBingo*150);
		}
		System.out.format("\n\n%50s: %1s MAD", "Total", gamestotalprice);
	}

}
