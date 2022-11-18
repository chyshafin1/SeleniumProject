package learnAbstarctClass;

public class InternetForTV extends InternetUser{
	@Override
	void ATT() {
		System.out.println("ATT Subscription");
	}
	@Override
	void PrimeVideo() {
		System.out.println("PrimeVideo Subscription");
	}
	@Override
	void Hulu() {
		System.out.println("Hulu Subscription");
	}
	
	
}
