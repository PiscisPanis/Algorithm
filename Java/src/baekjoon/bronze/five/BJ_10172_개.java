package baekjoon.bronze.five;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BJ_10172_개 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("|\\_/|\n" + 
				"|q p|   /}\n" + 
				"( 0 )\"\"\"\\\n" + 
				"|\"^\"`    |\n" +
				"||_/=\\\\__|\n");
		
		bw.flush();
		bw.close();
	}
}
