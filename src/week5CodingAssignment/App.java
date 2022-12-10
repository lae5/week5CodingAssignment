package week5CodingAssignment;

public class App {

	public static void main(String[] args) {//created class app w/main method
		
		AsteriskLogger aLog = new AsteriskLogger();//instantiate instance of both logger classes
		aLog.log("Hello");						//that implement logger interface
		aLog.error("Bye");
		
		SpacedLogger sLog = new SpacedLogger();
		sLog.log("Homework");
		sLog.error("Study Group");//tested both instances by passing in strings

		
		
	}

}
