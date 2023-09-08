package mypets;

import mypets.pets.KalaKitty;
import mypets.pets.Pet;

import java.util.ArrayList;
import java.util.Arrays;

import mypets.interfaces.Talk;
import mypets.pets.DinkyDoggie;
import mypets.pets.PollyParrot;

public class App {

	public static void main(String[] args) {
		
		Comm comm = new Comm();
		
		ArrayList<Pet> pets = new ArrayList<Pet>(Arrays.asList(
				new DinkyDoggie("Clever", 3, "green"),
				new KalaKitty("Snowball", 5, "black"),
				new PollyParrot("Fred", 100, "multi-color", "chef hat")
				));
		
		Pet currentPet = pets.get(1);
		
		boolean inPlay = true;
		
		while ( inPlay ) {
			
			String command = comm.getRequest(String.format(
					"You have a %s %s named %s. They have %d happiness.\n\nRequest",
					currentPet.getColor(),
					currentPet.getType(),
					currentPet.getName(),
					currentPet.getHappiness()
					));
			
			switch( command ) {
				case "quit":
					inPlay = false;
					break;
				
				case "pet":
		        	comm.outputLine(
		        			String.format("%s gained %d happiness. They now have %d happiness.", 
			        			currentPet.getName(), 
			        			currentPet.pet(),
			        			currentPet.getHappiness()
			        			)
		        			);
					break;
					
				case "change":
					
					for(Pet pet : pets){
						comm.outputLine(pet.getName());
					}
					
					String choice = comm.getRequest("Choose a pet");
					
					System.out.println(choice);
					
					for(Pet pet : pets){
						
						if ( pet.getName().toLowerCase().equals(choice) ) {
							currentPet = pet;
						}
					}
					
					break;
					
				case "go for walk":
					
		        	comm.outputLine(
		        			String.format("%s gained %d happiness. They now have %d happiness.", 
			        			currentPet.getName(), 
			        			currentPet.goForWalk(),
			        			currentPet.getHappiness()
			        			)
		        			);
					
					break;
					
				case "speak":
					
					Integer gainedHappiness= 0;
					
					try {
						gainedHappiness = ((Talk) currentPet).speak();
					}
					catch(Exception e) {
						comm.outputLine("This Pet can't talk;");
						break;
					}
					
		        	comm.outputLine(
		        			String.format("%s gained %d happiness. They now have %d happiness.", 
			        			currentPet.getName(), 
			        			gainedHappiness,
			        			currentPet.getHappiness()
			        			)
		        			);
					
					break;
					
				default:
					comm.outputLine("Invalid Command.");
					
			}
		}
		
		comm.outputLine("Bye!");
		comm.close();
	}

}
