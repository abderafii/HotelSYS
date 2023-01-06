package Hotel;

import java.util.Scanner;

public class roompricecalc {
	int roomtype = 0;
	int numbofnights;
	int totalprice;
	int roomprice;
	String roomdesc;

	Scanner scanner = new Scanner(System.in);
	
	public int calctotalprice() {
		
		while(roomtype != 1 && roomtype != 2 && roomtype != 3 && roomtype != 4) {
			System.out.println("\nPlease choose an room type from the following menu:");
			System.out.println("----------------Rooms Menu--------------");
			System.out.println("1. Single Bed Room: 100 MAD");
			System.out.println("2. Twin Bed Room: 200 MAD");
			System.out.println("3. Studio: 300 MAD");
			System.out.println("4. Suite: 500 MAD");
			System.out.println("----------------------------------------");
			System.out.print("Your choice: ");
			roomtype = scanner.nextInt();
			
			if (roomtype == 1) {
				roomprice = 100;
				roomdesc = "Single Bed Room";
			} else if (roomtype == 2) {
				roomprice = 200;
				roomdesc = "Twin Bed Room";
			} else if (roomtype == 3) {
				roomprice = 300;
				roomdesc = "Studio";
			} else if (roomtype == 4) {
				roomprice = 500;
				roomdesc = "Suite";
			} else {
				System.out.println("Error! Please type in a valid room type");
			}
		}
	
		System.out.print("Please enter the number of nights that you want to stay for in the hotel :");
		numbofnights = scanner.nextInt();
		
		totalprice = roomprice * numbofnights;
		return totalprice;
	}
	
	public void roombill() {
		System.out.println("\n--------------Room Bill--------------");
		System.out.format("%-16s %-13s %-16s %-13s", "Room Type", "No. Nights", "Price Per Night", "Total Price");
		System.out.format("\n%-16s %-13s %-16s %-13s\n", roomdesc, numbofnights, roomprice, totalprice);
		System.out.format("\n%53s: %1s MAD", "Total", totalprice);
	}
}


