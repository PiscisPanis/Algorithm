package paradigm.exhaustive;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class PowersetTest {

	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	private static int N = 3;
	private static int[] numbers;
	private static boolean[] isSelected;

	public static void main(String[] args) throws IOException {
		numbers = new int[] { 1, 2, 3 };
		isSelected = new boolean[N + 1];

		powerset(0);

		bw.flush();
		bw.close();

	}

	private static void powerset(int cnt) throws IOException {
		if (cnt == N) {
			for (int i = 0; i < N; i++) {
				bw.write((isSelected[i] ? numbers[i] : "X") + " ");
			}
			bw.write("\n");
			return;
		}

		isSelected[cnt] = true;
		powerset(cnt + 1);

		isSelected[cnt] = false;
		powerset(cnt + 1);
	}

}
