package Arrylist;

import java.util.ArrayList;
import java.util.List;

public class Learanlist {

	public static void main(String[] args) {
		
		List<Integer>id =new ArrayList<Integer>();
		
		id.add(10);
		id.add(20);
		id.add(30);
		id.add(40);
		
		System.out.println(id);
		
		System.out.println("..................");

		System.out.println(id.contains(30));
		
		System.out.println("..................");
		
		System.out.println(id.size());
		
		System.out.println("..................");
		
		for(Integer eachid : id) {
			System.out.println(eachid);
		
		}
		
	}

}
