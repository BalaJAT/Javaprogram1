package learning.java;

import java.util.Scanner;

public class HotelTrafficCalculator {
	
	
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the month (1-12): ");
	        int month = scanner.nextInt();

	        System.out.print("Enter the room rent per day: ");
	        double roomRent = scanner.nextDouble();

	        System.out.print("Enter the number of days stayed: ");
	        int numberOfDays = scanner.nextInt();

	        double totalTariff;
	        switch (month) {
	            case 4:
	            case 5:
	            case 6:
	            case 11:
	            case 12:
	                totalTariff = roomRent * 1.20 * numberOfDays;
	                break;
	            default:
	                totalTariff = roomRent * numberOfDays;
	                break;
	        }

	        System.out.printf("Hotel rent: %.2f%n", totalTariff);

	        scanner.close();
	    }

}
