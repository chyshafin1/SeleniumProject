package javaDemo;

public class StringConcept1 {

	public static void main(String[] args) {
		String text  ="Text";
		String text1 = "Text";
		String text2 = "Text";
		
		//Finding Memory location
		
		System.identityHashCode(text);
		System.identityHashCode(text1);
		System.identityHashCode(text2);
		System.out.println(System.identityHashCode(text));
		System.out.println(System.identityHashCode(text1));
		System.out.println(System.identityHashCode(text2));
		
		//compare the vale of two different value
		
		text.equals(text);
		text.equals(text1);
		text.equals(text2);
		System.out.println(text.equals(text));
		System.out.println(text.equals(text1));
		System.out.println(text.equals(text2));
	
		System.out.println("........................");
		
		// comparing memory address
		
		System.out.println(text1.equals(text2));
		System.out.println(text.equals(text1));
		
		System.out.println("........................");
		
		//comapring memory address
		
		System.out.println(text==text1);
		System.out.println(text==text2);
		System.out.println(text1==text2);
		
		System.out.println("........................");
		
		//length
		System.out.println(text.length());
		
		//concat (only for string string)
		System.out.println(text.concat(text2.concat(text1)));
		System.out.println("........................");
		
		//Trim 
		String text3 = "   Hellow World   ";
		System.out.println(text3);
		System.out.println(text3.trim());
		
		//concat
		System.out.println(text.concat(text2.concat(text3.concat(text1))));
		
		//contains
		System.out.println(text.contains("abc"));
		System.out.println(text2.contains("efg"));
		System.out.println(text3.contains("Hellow World"));
		
		//uppercase
		System.out.println(text.toUpperCase());
		System.out.println(text3.trim().toUpperCase());
		//Lowecase
		
		System.out.println(text.toLowerCase());
		
		System.out.println(text3.trim().toLowerCase());
		
		// concart
		
		String txt1="my";
		String txt2= "name";
		String txt3 = "xyz";
		
		int num = 123;
		
		String txt4 = "sao";
		String txt5 = "ejfoew";
		
		System.out.println(txt1+",".concat(txt2+" ".concat(txt3+"  "+num+" ".concat(txt4+" " .concat(txt5)))));
		
		
		
		
	}

}
