package task1;
import java.util.*;
public class ArithmeticOperator {

	public static void addition(int num1, int num2)
	{
		System.out.println("The addition of two numbers is: "+(num1+num2));
	}
	public static void substraction(int num1, int num2)
	{
		System.out.println("The substraction of two numbers is: "+(num1-num2));
	}
	public static void multiplication(int num1, int num2)
	{
		System.out.println("The multiplication of two numbers is: "+(num1*num2));
	}
	public static void division(int num1, int num2)
	{
		System.out.println("The division of two numbers is: "+(num1/num2));
	}
	public static void modulo(int num1, int num2)
	{
		System.out.println("The modulo of two numbers is: "+(num1%num2));
	}
	public static void main(String[] args) {
		// Arithmetic operatos are: +, -,*, /, %..
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Performing Arithmetic Operation");
		System.out.println("Enter number1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter number1: ");
		int num2 = sc.nextInt();
		
		addition(num1, num2);
		substraction(num1,num2);
		multiplication(num1,num2);
		division(num1,num2);
		modulo(num1,num2);
		

	}

}
