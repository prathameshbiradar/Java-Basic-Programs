package task1;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		// Logical Operator: &&, ||, !
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age>=12 && age<=18)
		{
			System.out.println("Student is minor");
		}
		else if(age <= 12 || age >=18)	
		{
			System.out.println("Student is eligible");
		}
		
	}

}
