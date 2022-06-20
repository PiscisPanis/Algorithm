package baekjoon.bronze.five;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BJ_10171_고양이 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("\\    /\\\n" + 
				" )  ( ')\n" + 
				"(  /  )\n" + 
				" \\(__)|\n");
		
		bw.flush();
		bw.close();
	}

}
