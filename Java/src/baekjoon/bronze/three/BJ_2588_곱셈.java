package baekjoon.bronze.three;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BJ_2588_곱셈 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		int posOne = (B%10);
		int posTwo = ((B%100) - posOne);
		int posThr = ((B%1000) - posTwo - posOne);

		bw.write(A * posOne + "\n" + (A * posTwo)/10 + "\n" + (A * posThr)/100 + "\n"
				+ ((A * posOne) + (A * posTwo) + (A * posThr)));

		bw.flush();
		bw.close();
	}

}
