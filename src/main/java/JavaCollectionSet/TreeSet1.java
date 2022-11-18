package JavaCollectionSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		
		Set<Integer>num = new TreeSet<Integer>();
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
