import java.util.Map;
import java.util.TreeMap;

public class _19589_TreeMap_TreeMap {
	public static void main(String[] args) {

		long start_time1 = System.currentTimeMillis();

		TreeMap<Integer, String> myRecord = new TreeMap<Integer, String>();

		for (int i = 0; i < 10000000; i++) {
			myRecord.put(i, "" + i);
		}

		for (Map.Entry m : myRecord.entrySet()) {
			// System.out.println(m.getKey() + " " + m.getValue());
		}

		long end_time1 = System.currentTimeMillis();
		System.out.println(end_time1 - start_time1);
	}
}