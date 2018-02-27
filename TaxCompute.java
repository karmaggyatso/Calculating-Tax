import java.util.*; 

public class TaxCompute {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		float price; 
		System.out.println("Enter a number: ");
		price = input.nextFloat();
		System.out.println("Basic Rate: " + computecostbasic(price));
		System.out.println("Luxury Rate: " + computeluxurybasic(price));
		
	}
	public static double basicRate = 0.04;
	public static double luxuryRate = 0.10; 

	public static String computecostbasic(float price) {
		String c;
		int pennies = (int) Math.round((price + (price * getNewRate())) * 100); 
		int wN = pennies/100; 
		int dN = pennies%100;   
		
		c = "$" + wN + "." + dN;
		if(dN < 10) {
			c = "$" + wN + ".0" + dN;
		}

		return c;
	}
	public static String computeluxurybasic(float price) {
		String c;
		int pennies = (int) Math.round((price + (price * getLuxuryRate())) * 100); 
		int wN = pennies/100; 
		int dN = pennies%100;   
		
		c = "$" + wN + "." + dN;
		if(dN < 10) {
			c = "$" + wN + ".0" + dN;
		}

		return c;

	}
	public static void changeBasicRateto(double newRate) {
		newRate = 0.05;
		basicRate=newRate; 
	}
	public static double getNewRate() {
		return basicRate; 
		
	}
	public static void changeLuxuryRateto(double newRate) {
		newRate = 0.15; 
		luxuryRate = newRate; 
	}
	public static double getLuxuryRate() {
		return luxuryRate; 
	}
	
}
