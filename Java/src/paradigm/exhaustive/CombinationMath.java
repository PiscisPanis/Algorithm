package paradigm.exhaustive;

public class CombinationMath {

	public static void main(String[] args) {
		System.out.println(combination(3,2));
	}

	private static int combination(int n, int r) {
		if(r == 0 || n == r) return  1;
		return combination(n-1, r-1) + combination(n-1, r);
	}

}
