package task1;

public class Variables {

	int age; //instance variables
	static int roll_no; //static or class variables
	Variables(int age) // Constructor
	{
		this.age =age;
	}
	static   // static block: used for initialize static variables
	{
		roll_no = 15;
	}
	public static void main(String[] args) {
		Variables va = new Variables(20); // Object created of class
		
		System.out.println(va.age);
		
		int sum = addition();  // calling method addition()
		System.out.println("Addition of numbers is: "+sum);
		
		System.out.println("Roll no. of student is: "+roll_no);
		

	}
	public static int addition() // addition()method returning integer value.
	{
		int num1 =12; // local variables
		int num2= 15;
		return num1+num2;	
	}

}
