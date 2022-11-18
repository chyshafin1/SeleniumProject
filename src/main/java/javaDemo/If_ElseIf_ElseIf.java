package javaDemo;

public class If_ElseIf_ElseIf {

	public static void main(String[] args) {
	  /*int A =20;
	  if(A<=10) {
		  System.out.println("20 is greater or equal to 20");
	  }
	  else if(A>35) {
		  System.out.println("20 is greater than to 35 ");
	  }
	  else if (A<78) {
		  System.out.println("20 is less than 78");
		 
	  }
	  else {
		  System.out.println("no result");
	  }
	  System.out.println(".....................");*/
		
		int A = 50;
		if(A<40 & A >70) {
			System.out.println("Grade A");
		}
		else if (A>20 & A>=50){
		 System.out.println("Grade B");
		}
		else if(A>60 & A<90) {
			System.out.println("Grade C");
		}
		else if (A<70 & A>30) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("No Result");
		}
	}

}
