package paradigm.exhaustive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class PermutationTest2 {
	
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	private static int[] input;
	private static int[] numbers;
	private static boolean[] isSelected;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int n = Integer.parseInt(br.readLine());
		int r = Integer.parseInt(br.readLine());
		
		input = new int[n];
		
		for (int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(br.readLine());
		}
		
		numbers = new int[n];
		isSelected = new boolean[n + 1];

		// for
		nestedFor(n);
		
		bw.write("\n");
		
		// Permutation
		permutation(0, n, r);

		bw.flush();
		bw.close();
	}

	private static void nestedFor(int n) throws IOException {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j != i) {
					for (int k = 1; k <= n; k++) {
						if (k != i && k != j) {
							bw.write(i + " " + j + " " + k + " " + "\n");
						}
					}
				}
			}
		}
	}

	/**
	 * @param cnt : 현재까지 뽑은 순열의 개수
	 */
	private static void permutation(int cnt, int n, int r) throws IOException {
		
		if(cnt == r) {
//			System.out.println(Arrays.toString(numbers));
			for (int i = 0; i < r; i++) {
				bw.write(numbers[i] + " ");
			}
			bw.write("\n");
			return;
		}
		
		// 현재의 인덱스에서 입력된 수가 사용중인지를 확인하는 반복문
		for (int i = 0; i < n; i++) {
			if(isSelected[i]) continue; // 사용 중인 수라면 다음 수로
			
			numbers[cnt] = input[i];
			isSelected[i] = true;
			
			// 다음 자리순열 뽑으러
			permutation(cnt + 1, n, r);
			isSelected[i] = false;
		}
	}

}
