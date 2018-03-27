import java.util.TreeSet;

public class _17642_TreeSet_TreeSet {
	public static void main(String[] args) {

		long start_time = System.currentTimeMillis();

		TreeSet<String> myRecord = new TreeSet<String>();

		for (int i = 0; i < 10000000; i++) {
			myRecord.add("" + i);
		}

		for (String str : myRecord) {
			// System.out.println(str);
		}
		
		long end_time = System.currentTimeMillis();
		System.out.println(end_time - start_time);
	}
}
