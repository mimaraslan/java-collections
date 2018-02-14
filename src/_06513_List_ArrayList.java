import java.util.ArrayList;
import java.util.List;

public class _06513_List_ArrayList {
	public static void main(String[] args) {

		long start_time1 = System.currentTimeMillis();

		List<String> myRecord = new ArrayList<String>();

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
