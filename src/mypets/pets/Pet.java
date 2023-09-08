package mypets.pets;

import java.util.Random;

public abstract class Pet {
	
	protected String name;
	protected Integer happiness;
	protected String color;
	protected String type;
	
	protected Random rand = new Random();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHappiness() {
		return happiness;
	}
	public String getColor() {
		return color;
	}
	public String getType() {
		return type;
	}
	
	
	public Pet() {}
	
	
	public Pet(String type, String name, Integer happiness, String color ) {
		
		this.type = type;
		this.name = name;
		this.happiness = happiness;
		this.color = color;
		
	}
	
	public Integer pet() {
		
		System.out.println(String.format("%s is playing", this.name));
		
		Integer gainedHappiness = this.rand.nextInt(3) + 1; // 1-3
		this.happiness += gainedHappiness;
		return (gainedHappiness);
	}
	
	public int goForWalk() {
		
		System.out.println(String.format("%s is going for a walk", this.name));
		
		Integer gainedHappiness = this.rand.nextInt(5) - 1; // -1 to 3
		this.happiness += gainedHappiness;
		return (gainedHappiness);
		
	}
	
	
	
}
