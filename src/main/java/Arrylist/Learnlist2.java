package Arrylist;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.util.SystemOutLogger;

public class Learnlist2 {

	public static void main(String[] args) {
		
		List<String> name = new ArrayList<String>();
		
		name.add("shafin");
		name.add("mamun");
		name.add("tanbir");
		name.add("rahman");
		
		System.out.println(name);
		
		System.out.println("..................");
		
		System.out.println(name.size());
		
		System.out.println("..................");
		
		for(String eachname : name) {
			System.out.println(eachname);
			}
		System.out.println("..................");
		
		name.add("xyz");
		
		System.out.println(name);
		
		System.out.println("..................");
		
		System.out.println(name.get(0));
		System.out.println(name.get(3));
		
		System.out.println("..................");
		
		name.clear();
		name.isEmpty();
		
		//name.add("abc");
		System.out.println(name.isEmpty());
		
	}

}
