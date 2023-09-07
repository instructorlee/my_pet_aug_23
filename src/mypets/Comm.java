package mypets;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Comm {
	
	private Scanner in = new Scanner(System.in);
	
	public String getRequest(String prompt) {
		
		System.out.print("\n\n" + prompt + " :");
		
		return in.nextLine().toLowerCase();
	}
	
	public void close() {
		in.close();
	}
	
	public boolean confirmYesNo(String prompt) {
		return get(prompt + "(y/n)", Arrays.asList("y", "n")).contains("y");
	}
	
	public String get(String prompt, List<String> filter) {
		return get(Arrays.asList(prompt), filter);
	}
	
	public String get(List<String> prompt, List<String> filter) {
		
		String b = " ";
		
		while(!filter.contains(b)) {
			output(prompt);
			b = in.nextLine();
		}
		
		return b;
	}
	
	public String input(String prompt, boolean require) {
		return input(Arrays.asList(prompt), require);
	} 
	
	public String input(List<String> prompt, boolean require) {
		
		String b = "";
		
		while(b == "") {
			output(prompt);
			b = in.nextLine();
		}
		
		return b;
	}
	
	public void output(List<String> lines) {
		System.out.println("\n");
		for (String line : lines) System.out.println(line);
	}
	
	public void outputLine(String line) {
		output(Arrays.asList(line));
	}
}
