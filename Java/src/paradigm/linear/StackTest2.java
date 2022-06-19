package paradigm.linear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class StackTest2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		String input = null;
		String current = "http://www.google.com";
		
		Stack<String> back = new Stack<String>();
		Stack<String> forward = new Stack<String>();
		
		while(true) {
			input = br.readLine();
			
			if(input.charAt(0) == 'Q') break;
			
			st = new StringTokenizer(input, " ");
			
			switch(st.nextToken()) {
			case "V":
				forward.clear();
				back.push(current);
				current = st.nextToken();
				System.out.println(current);
				break;
			case "B":
				if(back.isEmpty()) {
					System.out.println("Ignored.");
				} else {
					forward.push(current);
					current = back.pop();
					System.out.println(current);
				}
				break;
			case "F":
				if(forward.isEmpty()) {
					System.out.println("Ignored.");
				} else {
					back.push(current);
					current = forward.pop();
					System.out.println(current);
				}
				break;
			}
		}
	}

}
