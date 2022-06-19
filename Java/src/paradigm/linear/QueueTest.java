package paradigm.linear;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		System.out.println(queue.isEmpty() + "/" + queue.size());
		
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		queue.offer("F");
		
		System.out.println(queue.isEmpty() + "/" + queue.size());
		System.out.println(queue.peek());
		System.out.println(queue.isEmpty() + "/" + queue.size());
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		// 큐 안의 원소가 없으면 런타임 오류를 내는 것이 아니라 null을 반환한다.
		if(queue.poll() != null) {
			System.out.println(queue.poll());
		}
	}

}
