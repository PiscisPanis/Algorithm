package paradigm.exhaustive;

import java.io.IOException;
import java.util.Arrays;

public class PermutationTest {

	private static int N = 3, R = 3;
	private static int[] numbers;
	private static boolean[] isSelected;

	public static void main(String[] args) throws NumberFormatException, IOException {

		numbers = new int[R];
		isSelected = new boolean[N + 1];

		permutation(0);
	}

	/**
	 * @param cnt : 현재까지 뽑은 순열의 개수
	 */
	private static void permutation(int cnt) {

		if (cnt == R) {
			System.out.println(Arrays.toString(numbers));
			return;
		}

		// 현재의 인덱스에서 입력된 수가 사용중인지를 확인하는 반복문
		for (int i = 1; i <= N; i++) {
			if (isSelected[i]) continue; // 사용 중인 수라면 다음 수로

			numbers[cnt] = i;
			isSelected[i] = true;

			// 다음 자리순열 뽑으러
			permutation(cnt + 1);
			isSelected[i] = false;
		}
	}

}
