package ArrayListInCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Combine2ArrayLists {

	public static void main(String[] args) {
		
		List<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
        
        List<String> listTwo = new ArrayList<>(Arrays.asList("a", "b", "c", "f", "g"));
        
        
        Set<String>  set = new LinkedHashSet<String>(listOne);
        set.addAll(listTwo);
        List<String> combinedList = new ArrayList<String>(set);
        System.out.println("The combined arrayList is " + combinedList);

	}

}


