package paradigm.exhaustive;

import java.util.Arrays;
import java.util.Scanner;

public class DiceTest {

	private static int N, numbers[], totalCnt;
	private static boolean[] isSelected;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		numbers = new int[N];
		totalCnt = 0;
		
		int M = sc.nextInt();
		
		switch(M) {
		case 1: // 주사위 던지기 1 : 중복순열
			break;
		case 2: // 주사위 던지기 2 : 순열
			isSelected = new boolean[7];
			dice2(0);
			break;
		case 3: // 주사위 던지기 3 : 중복조합
			break;
		case 4: // 주사위 던지기 4 : 조합
			break;
		}
		
		System.out.println("경우의 수 : " + totalCnt);
		
		sc.close();
	}

	private static void dice2(int cnt) {
		if(cnt == N) {
			System.out.println(Arrays.toString(numbers));
			return;
		}
		
		for (int i = 1; i <= 6; i++) {
			if (isSelected[i]) continue; // 사용 중인 수라면 다음 수로

			numbers[cnt] = i;
			isSelected[i] = true;

			// 다음 자리순열 뽑으러
			dice2(cnt + 1);
			isSelected[i] = false;
		}
	}

}
