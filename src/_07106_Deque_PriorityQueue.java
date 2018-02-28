import java.util.ArrayDeque;
import java.util.Deque;

public class _07106_Deque_PriorityQueue {
	public static void main(String[] args) {

		long start_time1 = System.currentTimeMillis();

		Deque<String> myRecord = new ArrayDeque<String>();

		for (int i = 0; i < 10000000; i++) {
			myRecord.add("" + i);
		}

		for (String str : myRecord) {
			// System.out.println(str);
		}
		
		long end_time1 = System.currentTimeMillis();
		System.out.println(end_time1 - start_time1);
	}
}
