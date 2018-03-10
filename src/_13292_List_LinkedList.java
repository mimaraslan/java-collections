import java.util.LinkedList;
import java.util.List;

public class _13292_List_LinkedList {
	public static void main(String[] args) {

		long start_time2 = System.currentTimeMillis();

		List<String> myRecord = new LinkedList<String>();
		
		for (int i = 0; i < 10000000; i++) {
			myRecord.add("" + i);
		}

		for (String str : myRecord) {
			// System.out.println(str);
		}
		
		long end_time2 = System.currentTimeMillis();
		System.out.println(end_time2 - start_time2);
	}
}
