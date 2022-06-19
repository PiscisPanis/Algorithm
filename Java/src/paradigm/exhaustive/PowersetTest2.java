package paradigm.exhaustive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class PowersetTest2 {
	
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	private static int[] input;
	private static boolean[] isSelected;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		
		input = new int[n];
		
		for (int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(br.readLine());
		}
		
		isSelected = new boolean[n + 1];

		// for
		nestedFor(n);
		
		bw.write("\n");
		
		// Permutation
		powerset(0, n);

		bw.flush();
		bw.close();
	}

	private static void nestedFor(int n) throws IOException {
		for (int i = 1; i <= 2; i++) {
			isSelected[0] = i % 2 !=0 ? true : false;
			for (int j = 1; j <= 2; j++) {
				isSelected[1] = j % 2 !=0 ? true : false;
				for (int k = 1; k <= 2; k++) {
					isSelected[2] = k % 2 !=0 ? true : false;
					for (int m = 0; m < n; m++) {
						bw.write((isSelected[m] ? input[m] : "X") + " ");
					}
					bw.write("\n");
				}


			}
		}
	}

	private static void powerset(int cnt, int n) throws IOException {
		if(cnt == n) {
			for (int i = 0; i < n; i++) {
				bw.write((isSelected[i] ? input[i] : "X") + " ");
			}
			bw.write("\n");
			return;
		}
		
		isSelected[cnt] = true;
		powerset(cnt+1, n);
		isSelected[cnt] = false;
		powerset(cnt+1, n);
	}

}
