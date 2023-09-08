package mypets.pets;

import mypets.interfaces.Talk;

public class PollyParrot extends Pet implements Talk {
	
	String hat;
	
	public PollyParrot() {}
	
	public PollyParrot(String name, Integer happiness, String color, String hat ) {
		super("PollyParrot", name, happiness, color);
		
		this.hat = hat;
	}
	
	@Override public int goForWalk() {
		
		System.out.println(String.format("%s is going for a fly", this.name));
		
		Integer gainedHappiness = this.rand.nextInt(7) - 2; // -2 to 4
		this.happiness += gainedHappiness;
		return (gainedHappiness);
		
	}

	public int speak() {
		
		System.out.println(String.format("Hello! My name is %s", this.name));
		Integer gainedHappiness = this.rand.nextInt(2); // 0 or 1
		this.happiness += gainedHappiness;
		return (gainedHappiness);
	}

	public int say(String quote) {
		
		System.out.println(String.format(quote));
		Integer gainedHappiness = this.rand.nextInt(2); // 0 or 1
		this.happiness += gainedHappiness;
		return (gainedHappiness);
	}
}
