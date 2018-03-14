import java.util.HashSet;

public class _16709_HashSet_HashSet {
	public static void main(String[] args) {

		long start_time1 = System.currentTimeMillis();

		HashSet<String> myRecord = new HashSet<String>();// creating arraylist

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
