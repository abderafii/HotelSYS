package Hotel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class user_info {
	String fname;
	String lname;
	String CusAddress;
	Date Checkin = new Date( );
	Date Checkout = new Date( );
	String checkin;
	String checkout;
	int roomnumb;
	
	Scanner scanner = new Scanner(System.in);
	
	public void fillinfo() {
		
		System.out.println("Please fill the following info: ");
		
		System.out.print("First Name: ");
		fname = scanner.next();
		
		System.out.print("Last Name: ");
		lname = scanner.next();
		
		System.out.print("Room Number: ");
		roomnumb = scanner.nextInt();
		
		System.out.print("Current Address: ");
		CusAddress = scanner.next();
		
		System.out.print("Check in Date (ex:01/28/2000): ");
		String str = scanner.next();
		if(str.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")){
		    SimpleDateFormat f = new SimpleDateFormat("MM/dd/yyyy");
		    try {
				Checkin = f.parse(str);
				checkin = f.format(Checkin);
			} catch (ParseException e) {
				System.out.println("Error! Please respect the input format");
				System.exit(-1);
			}
		}
		else {
		    System.out.println("Error! Please respect the input format");
		    System.exit(-1);
		}
		System.out.print("Check out Date (ex:01/28/2000): ");
		String str2 = scanner.next();
		if(str2.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")){
		    SimpleDateFormat f2 = new SimpleDateFormat("MM/dd/yyyy");
		    try {
				Checkout = f2.parse(str2);
				checkout = f2.format(Checkout);
			} catch (ParseException e) {
				System.out.println("Error! Please respect the input format");
				System.exit(-1);
			}
		}
		else {
		    System.out.println("Error! Please respect the input format");
		    System.exit(-1);
		}
		
	}
	
	public void printinfo() {
		System.out.println("\nThe Following are your personal informations: ");
		System.out.println("First Name: "+fname);
		System.out.println("Last Name: "+lname);
		System.out.println("Room Number: "+roomnumb);
		System.out.println("Current Address: "+CusAddress);
		System.out.println("Check in Date: "+checkin);
		System.out.println("Check out Date: "+checkout);
	}
}
