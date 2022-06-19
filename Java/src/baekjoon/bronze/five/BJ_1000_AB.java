package baekjoon.bronze.five;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ_1000_AB {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		double A = Integer.parseInt(st.nextToken());
		double B = Integer.parseInt(st.nextToken());

		bw.write(A / B + "\n");

		bw.flush();
		bw.close();
	}
}
