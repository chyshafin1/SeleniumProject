package JavaCollectionSet;

import java.util.HashSet;
import java.util.Set;

public class HashSet2 {

	public static void main(String[] args) {
		
		Set<String>ani = new HashSet<String>();
		
		ani.add("cow");
		ani.add("cat");
		ani.add("goat");
		ani.add("horse");
		
		System.out.println(ani);
		
		System.out.println(ani.size());
		
		ani.add("dog");
		
		System.out.println(ani.contains("cat"));
		
		for( String Eachani : ani) {
			System.out.println(Eachani);
		}
		
		ani.clear();
		System.out.println(ani.isEmpty());

	}

}
