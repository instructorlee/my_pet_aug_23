package mypets.pets;

public class PollyParrot extends Pet {
	
	String hat;
	
	public PollyParrot() {}
	
	public PollyParrot(String name, Integer happiness, String color, String hat ) {
		super("PollyParrot", name, happiness, color);
		
		this.hat = hat;
	}
}
