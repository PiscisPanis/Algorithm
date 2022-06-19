package paradigm.recursive;

public class FactorialTest {

	private static int res = 1;
	
	public static void main(String[] args) {
		
		System.out.println(factorial_for(5));
		System.out.println(factorial_recur(5));
		factorial_recur2(5);
		System.out.println(res);
	}

	private static int factorial_recur(int n) {
		if(n<=1) return 1;
		
		return n * factorial_recur(n-1);
	}
	
	private static void factorial_recur2(int i) {
		if(i == 0) {
			return;
		}
		res *= i;
		factorial_recur2(i-1);
	}


	private static int factorial_for(int n) {
		int res = 1;
		for (int i = n; i > 0; i--) {
			res *= i;
		}
		
		return res;
	}

}
