package task1;

public class UnaryOperators {

	public static void main(String[] args) {
	    // Unary operators are: +, -, ++ , --
		int num1 =25;
		
		int sum = ++num1 + 25; //used pre-increment operator
		System.out.println(sum);
		System.out.println(num1);
		
		int sum1 = num1++ + 25; //used post-increment operator
		System.out.println(sum1);
		System.out.println(num1);
		
		int substraction = --num1 -1 ; //used pre-decrement operator
		System.out.println(substraction);
		System.out.println(num1);
		
		int substraction2 = (num1--) -1 ; // used post-decrement operator.
		System.out.println(substraction2);
		System.out.println(num1);


	}

}
