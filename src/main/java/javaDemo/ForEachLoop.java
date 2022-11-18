package javaDemo;

public class ForEachLoop {

	public static void main(String[] args) {
		
		String[] Object = new String[5];
		
		Object[0]="Max";
		Object[1]="Min";
		Object[2]="Mad";
		Object[3]="Ssj";
		Object[4]="Hdjd";
		
		for(String eachObject : Object) {
			System.out.println(eachObject);
		}
		
		System.out.println("............................");
		
		int[] nums= {10,20,30,40,50,60,70};
		
	 for(int  eachNums : nums ) {
		 System.out.println(eachNums);
	 }
	 System.out.println("............................");
	 
	 System.out.println(nums.length);
	}

}
