//This program will compute factorial of a number in Java using recursion method.
public class Factorial {
	
	public static void main(String[] args) {
		
		System.out.println(fact(5));
		System.out.println(fact(1));
		System.out.println(fact(0));
		System.out.println(fib(4));
		
	}
	
	static int fact(int n) {
		
		if(n>=1) {
			return n * fact(n-1); //recursive case
		}
		else {
			return 1; //base case
		}
	}
	
	static int fib(int n) {
		if(n>=3) {
			return fib(n-1)+fib(n-2);
		}
		else {
			return 1;
		}
	}
}
