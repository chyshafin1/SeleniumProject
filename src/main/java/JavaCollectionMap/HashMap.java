package JavaCollectionMap;

import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections4.map.HashedMap;

public class HashMap {

	public static void main(String[] args) {
		Map <String ,String>  name = new HashedMap<String ,String>();
		name.put("FirstName", "LastName");
		name.put("shafin", "chy");
		name.put("mamun", "rahman");
		name.put("tanbir", "ahmed");
		name.put("xyz", "abc");
		
		System.out.println(name);
		System.out.println(name.containsKey("mamun"));
		System.out.println(name.containsValue("rahman"));
		System.out.println(name.size());
		
		for(Entry <String, String> eachName: name.entrySet()) {
			System.out.println(eachName.getKey()+" "+eachName.getValue());
			}
		
		name.remove("xyz");
		System.out.println(name.size());
		name.clear();
		System.out.println(name.isEmpty());

	}

}
