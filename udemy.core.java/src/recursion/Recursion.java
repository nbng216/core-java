package recursion;

public class Recursion {

	public static void main(String[] args) {

//program to calculate factorial using recrusion.

		//System.out.println(fact(3));
		factorial(4);
		
	}

//	public static int fact(int n) {
//		//System.out.println(n);
//		if (n == 0) {
//			return 1;
//
//		}
//		return fact(n - 1) * n;
//	}

	public static void factorial(int value) {
		int factOfValue = 1;
		int i=1;

		while (i<=value) {
			factOfValue = factOfValue*i;
			i++;
		}

		System.out.println(factOfValue);
	}
}
