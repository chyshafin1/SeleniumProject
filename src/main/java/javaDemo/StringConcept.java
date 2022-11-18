package javaDemo;

public class StringConcept {

	public static void main(String[] args) {
		String text = "String Concept";
		String text1 = "String Concept";
		
		
		System.out.println(System.identityHashCode(text));
		System.out.println(System.identityHashCode(text1));
		
		System.out.println(text);
		System.out.println(text1);
		
		System.out.println(text.equals(text1));
		
		System.out.println("..............................");
		
		System.out.println(text == text1);
		
		System.out.println(System.identityHashCode(text));
		System.out.println(System.identityHashCode(text1));
		
		
		String text2 = "learing String";
		System.out.println(text2.length());
		
		System.out.println(text.concat(text2));
		
		String num= "20";
		int a =10;
		int b=20;
		System.out.println(num + a);
		
		System.out.println(a+b);
		
		
		String line = "  Java String concept ";
		System.out.println(line);
		System.out.println(line.length());
		System.out.println(line.trim());
		
		System.out.println(line.trim().length());
		
		
		String text4 = "Compares String";
		System.out.println(text4.toLowerCase());
		
		
		String text5 = "Compares String";
		System.out.println(text4.toUpperCase());
		
		
	}

}
