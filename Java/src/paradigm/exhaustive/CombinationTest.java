package paradigm.exhaustive;

import java.util.Arrays;

public class CombinationTest {

	private static int N = 3, R = 3;
	private static int[] numbers;
	
	public static void main(String[] args) {
		
		numbers = new int[R];

		combination(0, 1);

	}

	private static void combination(int cnt, int start) {
		if (cnt == R) {
			System.out.println(Arrays.toString(numbers));
			return;
		}

		// 현재의 인덱스에서 입력된 수가 사용중인지를 확인하는 반복문
		for (int i = start; i <= N; i++) {
			numbers[cnt] = i;

			// 다음 자리순열 뽑으러
			combination(cnt + 1, i+1);
		}
	}

}
