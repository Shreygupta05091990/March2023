package CustomCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CustomArrayList extends ArrayList {

	@Override
	public boolean add(Object o) {

		if (this.contains(o)) {
			return true;
		} else {
			return super.add(o);
		}

	}

	// Here, we are creating arrayList which is not going to allow the duplicates

	public static void main(String[] args) {

		final ArrayList<String> normal_list = new ArrayList<String>();
		normal_list.add("Shrey");
		normal_list.add("Shrey");
		System.out.println(normal_list);

		CustomArrayList noduplicateList = new CustomArrayList();
		noduplicateList.add("Shrey");
//		System.out.println(addISt);
		noduplicateList.add("Shrey");
//		System.out.println(add2nd);
		System.out.println(noduplicateList);

		Set<String> set = new HashSet<String>();
		set.add("String");
		set.add("String");
		System.out.println(set);

		// ArrayList<String> arrlsit = new LinkedList<String>(); --------> this wont
		// work here as it is final.
		//

	}

}
