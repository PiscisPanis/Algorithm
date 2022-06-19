 package paradigm.io;

import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.StringTokenizer;

public class IOTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// Scanner
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수,실수,문자열을 차례로 입력하세요 : ");
//		
//		System.out.print("읽은 정수 : "+sc.nextInt());
//		System.out.print("읽은 실수 : "+sc.nextDouble());
////		System.out.print("읽은 문자열 : "+sc.next()+"!!");
//		System.out.print("읽은 문자열 : "+sc.nextLine()+"!!");
		
		// Scanner FileInput
//		System.setIn(new FileInputStream("src/paradigm/io/input.txt"));
//		Scanner sc = new Scanner(System.in);
//		System.out.println("좋아하는 숫자? ");
//		int num = sc.nextInt();
//		System.out.println("가장 빠른 교통수단? ");
////		String msg = sc.next();
//		sc.nextLine();
//		String msg = sc.nextLine();
//		System.out.println(num+"::"+msg);
		
		
		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str = br.readLine();
//		char ch[] = str.toCharArray();
//		for (char c : ch) {
//			System.out.println(c);
//		}
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		while(n-- > 0) {
			int value = Integer.parseInt(st.nextToken());
			System.out.println(value);
		}
		
		// StringBuilder
		StringBuilder sb = new StringBuilder();
		sb.append("Hello ");
		sb.append("World!!");
		System.out.println(sb.toString());
		
		sb.setLength(sb.length()-2);
//		객체 참조변수 sb는 toString()을 콜백함수로 호출하기 때문에, "sb"로 호출해도 무관하다.
		System.out.println(sb);
	}

}
