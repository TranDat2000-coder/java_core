package learn_queue_deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainTest {

	public static void main(String[] args) {
		
//		Queue<String> myQueue = new LinkedList<String>();
//		
//		
//		myQueue.offer("Trần Quốc Đạt");
//		myQueue.offer("Phạm Thị Kiều Diễm");
//		myQueue.offer("Trần Đức Phát");
//		myQueue.offer("Trần Thị Thu Trang");
//		
//		while (true) {
//			String ten = myQueue.poll();
//			if (ten == null) {
//				break;
//			}
//			System.out.println(ten);
//		}
//		
//		Queue<Integer> myQueue2 = new PriorityQueue<Integer>();
//				
//		myQueue2.offer(13);
//		myQueue2.offer(10);
//		myQueue2.offer(50);
//		myQueue2.offer(30);
//		
//		while (true) {
//			Integer number = myQueue2.poll();
//			if (number == null) {
//				break;
//			}
//			System.out.println(number);
//		}
		
		Deque<String> myDeque = new ArrayDeque<String>();

		myDeque.offer("Trần Quốc Đạt");
		myDeque.offer("Phạm Thị Kiều Diễm");
		myDeque.offerFirst("Trần Đức Phát");
		
		myDeque.removeFirst();
		
		while (true) {
			String ten = myDeque.poll();
			if(ten == null) {
				break;
			}
			System.out.println(ten);
		}
	}
}
