package week5CodingAssignment;

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		
		for (int i=0; i <log.length(); i++) {//print space between each character in the String that passes in
			System.out.print(log.charAt(i) + " ");//i iterates through length and prints a character and space each time until <string length
		}
		System.out.println();
	}

	@Override
	public void error(String error) {
		System.out.print("ERROR: ");
		for (int i=0; i <error.length(); i++) {
			System.out.print(error.charAt(i) + " ");//same as above except prints the word ERROR before printing out String with a space between charactes
		}
		
	}

}
