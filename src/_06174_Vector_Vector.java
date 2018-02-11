import java.util.Vector;

public class _06174_Vector_Vector {
	public static void main(String[] args) {

		long start_time1 = System.currentTimeMillis();

		Vector<String> myRecord = new Vector<String>();

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
