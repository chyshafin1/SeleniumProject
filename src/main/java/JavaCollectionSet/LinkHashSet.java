package JavaCollectionSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHashSet {

	public static void main(String[] args) {
		Set<Integer>num = new LinkedHashSet<Integer>();
		
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		
		System.out.println(num);
		
		System.out.println(num.size());
		
		System.out.println(num.contains(30));
		
		System.out.println(num.add(50));
		
		for (Integer eachnum : num) {
			System.out.println(eachnum);
		}
		System.out.println(num.size());
		
		num.remove(50);
		
		System.out.println(num.size());
		
		num.clear();
		num.isEmpty();
		System.out.println(num.isEmpty());

	}

}
