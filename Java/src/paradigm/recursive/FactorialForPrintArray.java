package paradigm.recursive;

public class FactorialForPrintArray {

	private static int[] arr1 = { 10, 20, 30 };
	private static int[][] arr2 = { { 10, 20, 30 }, { 40, 50, 60 } };

	public static void main(String[] args) {
		printArray1();
		printArray2(0);			
		
		System.out.println();
		
		printArray3();
		printArray4(0, 0);
	}

	private static void printArray1() {
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}
		System.out.println();
	}

	private static void printArray2(int i) {
		if (i == arr1.length) return;
		
		System.out.print(arr1[i] + "\t");

		printArray2(i + 1);
	}

	private static void printArray3() {
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static void printArray4(int r, int c) {
		// arr2.length -> 행의 길이
		// arr2[r].length -> 열의 길이

		if (r == arr2.length) return;
		
		System.out.print(arr2[r][c] + "\t");
		
		int nr = r;
		int nc = c + 1;
		
		if(nc == arr2[r].length) {
			nr++;
			nc = 0;
			System.out.println();
		}
		
		printArray4(nr, nc);
	}

}
