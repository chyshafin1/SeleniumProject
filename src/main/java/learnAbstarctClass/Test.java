package learnAbstarctClass;

public class Test {

	public static void main(String[] args) {
		
		InternetUser IU;
		
		IU = new InternetForTV();
		IU.ATT();
		IU.Hulu();
		IU.Netfliex();
		IU.PrimeVideo();
		IU.Youtube();
		
		IU= new InternetForMovie();
		IU.ATT();
		IU.Hulu();
		IU.PrimeVideo();
		
	}

}
