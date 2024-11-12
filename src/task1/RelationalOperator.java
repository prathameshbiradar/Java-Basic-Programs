package task1;
import java.util.*;
public class RelationalOperator {

	public static void main(String[] args) {
		//Relation Operators: ==, !=, >, <, >=, <=
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age of student: ");
		int age = sc.nextInt();
		 
		if(age == 12)
		{
			System.out.println("Student is minor.");	
		}
		else if(age>12 && age<18)
		{
			System.out.println("Student is eligible to play");
		}
		else if(age>18 && age<45)
		{
			System.out.println("Student is major to play");
		}
		
		int num1 = 15;
		
		if(num1 != 15)
		{
			System.out.println("Number is not correct");
		}
		
	}

}
