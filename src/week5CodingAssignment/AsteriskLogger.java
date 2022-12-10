package week5CodingAssignment;

public class AsteriskLogger implements Logger{

	
	

	@Override//method overriding when implemented parent class
	public void log(String log) {//log method  
		System.out.println("***" + log + "***");//prints out asterisks String passed in asterisk
		
	}

	@Override
	public void error(String error) {//error method 
		System.out.println("*****************");//print asterisk above
		
		System.out.println("*** ERROR: " + error + "***"); //prints out asterisks word Error String passed in asterisk
		
		System.out.println("*****************");//print asterisk below
		
	}

}
