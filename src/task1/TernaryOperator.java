package task1;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); // imported Scanner class.
	int a=12;  // defined and initialized local variable a.
	int b = 15; // defined and initialized local variable b.
	
	int min = (a<b) ? a : b ;  // used ternary operator 
	System.out.println(min); //Printing Minimum value.
	 

	}

}
