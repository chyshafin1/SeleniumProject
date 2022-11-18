package javaDemo;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		String [] obj = new String[5];
		
		obj[0]="Max";
		obj[1]="Min";
		obj[2]="Mad";
		obj[3]="Ssj";
		obj[4]="Hdjd";
		
		int i=0;
		do {
			System.out.println(obj[i]);
			i++;
		}while(i <obj.length);
		
	}

}




