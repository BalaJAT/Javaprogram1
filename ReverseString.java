package learning.java;

import java.util.Scanner;

public class ReverseString {
	
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        scanner.close();

	        String reversedString = reverseString(input);

	        System.out.println("Reversed string: " + reversedString);
	    }

	    public static String reverseString(String str) {
	        int length = str.length();
	        StringBuilder reversed = new StringBuilder();

	        for (int i = length - 1; i >= 0; i--) {
	            reversed.append(str.charAt(i));
	        }

	        return reversed.toString();
	    }

}
