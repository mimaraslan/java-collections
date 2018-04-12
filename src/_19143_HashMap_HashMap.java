import java.util.HashMap;
import java.util.Map;

public class _19143_HashMap_HashMap {
	public static void main(String[] args) {

		long start_time1 = System.currentTimeMillis();

		HashMap<Integer, String> myRecord = new HashMap<Integer, String>();

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
