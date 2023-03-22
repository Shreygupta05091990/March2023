package TrickyInterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadOnly {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("SHrey");
		arrayList.add("SHrey1");
		arrayList.add("SHrey2");
		List<String> list = Collections.unmodifiableList(arrayList);

		arrayList.add("Saksham");
		arrayList.add(0, "Shantanu");

		list.add("Aishwarya"); // Unsupported Exception , since it has become unmodifaible.
		System.out.println("the list is " + list);
	}

}
