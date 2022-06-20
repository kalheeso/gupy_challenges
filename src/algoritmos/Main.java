package algoritmos;

public class Main {

	public static void main(String[] args) {
		int input = 8;
		System.out.println(getFibonacciTerm(input));
		System.out.println("Is input on Fibonacci sequence? " + isInputOnFibonacci(input));
	}
	
	public static int getFibonacciTerm(int input) {
		if (input == 1) {
			return 0;
		}
		if (input == 2) {
			return 1;
		}
		int firstPrevious = 0, lastPrevious = 1, current = 0;
		for (int i = 0; i < input - 2; i++) {
			current = firstPrevious + lastPrevious;
			firstPrevious = lastPrevious;
			lastPrevious = current;
		}
		return current;
	}
	
	public static boolean isInputOnFibonacci(int input) {
		int firstPrevious = 0, lastPrevious = 1, current = 0;
		while (current < input ) {
			current = firstPrevious + lastPrevious;
			firstPrevious = lastPrevious;
			lastPrevious = current;
			if (current == input) {
				return true;
			}
		}
		return false;
	}
}
