package paradigm.linear;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest2 {

	public static void main(String[] args) {
		int n = 20;
		Queue<int[]> queue = new LinkedList<int[]>();
		int person = 1;
		
		queue.offer(new int[] {person, 1});
		
		while(n>0) {
			if(!queue.isEmpty()) {
				int[] p = queue.poll();
				int availableCnt = (n>=p[1]?p[1]:n);
				n -= availableCnt;
				
				if(n == 0) {
					System.out.println("마지막으로 가져간 사람 : " + p[0] + "번, 가져간 개수 : " + availableCnt);
				} else {
					System.out.println(p[0] + "번이" + availableCnt + "만큼 가져갑니다. 남은 개수 : " + n);
					p[1]++;
					queue.offer(p);
					queue.offer(new int[] {++person, 1});
				}
				
			}
		}
	}

}
