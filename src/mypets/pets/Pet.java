package mypets.pets;

import java.util.Random;

public abstract class Pet {
	private String name;
	private Integer happiness;
	private String color;
	private String type;
	
	private Random rand = new Random();
	
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
		
		Integer gainedHappiness = this.rand.nextInt(3) + 1; // 1-3
		this.happiness += gainedHappiness;
		return (gainedHappiness);
	}
	
}
