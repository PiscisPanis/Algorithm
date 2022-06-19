package paradigm.exhaustive;

import java.util.Arrays;

// nPr ==> 3P2 = 3 * 2 = 6
// nCr = nPr / r! ==> 3C2 = 3P2 / 2! = 3 * 2 / 2 = 3 
public class PerCombiTest {
	public static int[] num= {1,2,3};   // num={1,2,3,4}
	public static int N=2;              // N=2, N=3
	public static int sCount=0;
	
	private static void makePermutation(int toSelect,int[] selected, boolean[] visited) {
		if(toSelect == N) {
			System.out.println(Arrays.toString(selected));
			return;
		}
		for(int i=0; i<num.length; i++) {
			if(!visited[i]) {
				visited[i]=true;
				selected[toSelect]=num[i];
				makePermutation(toSelect+1, selected, visited);
				visited[i]=false;
			}
		}		
	}
	
	//--------------------------------------------------------------------------------------
	private static void makeCombination(int toSelect, int[] selected, int startIdx) {
		if(toSelect == N) {
			System.out.println(Arrays.toString(selected));
			return;
		}
		for(int i=startIdx; i<num.length; i++) {
			selected[toSelect]=num[i];
			makeCombination(toSelect+1, selected, i+1);
		}
	}
	
	//--------------------------------------------------------------------------------------
	private static void powerSet(int cnt, boolean[] isSelected) {
		if(cnt == N) {
			sCount ++;
			System.out.print("{");
			for(int i=0; i<N; i++) {
				if(isSelected[i]) {
					System.out.print(num[i] + " ");
				}
			}
			System.out.print("},");
			return;
		}
		//����
		isSelected[cnt]=true;
		powerSet(cnt+1, isSelected);
		
		//����
		isSelected[cnt]=false;
		powerSet(cnt+1, isSelected);
	}
	
	//--------------------------------------------------------------------------------------
	public static void main(String[] args) {
//		1. num���� N���� �̾Ƽ� ���� �� �ִ� ������ ��� ����Ͻÿ�.
		System.out.println("-----����-----");
		makePermutation(0, new int[N], new boolean[num.length]);
		
//		2. num���� N���� �̾Ƽ� ���� �� �ִ� ������ ��� ����Ͻÿ�.
		System.out.println("-----����-----");
		makeCombination(0, new int[N], 0);
		
//		3. num���� ������ �� �ִ� ��� �κ������� ����Ͻÿ�.			
		System.out.println("-----�κ�����-----");
		powerSet(0, new boolean[N]);
		System.out.println("\n�� ����� ��: " + sCount);
	}
}