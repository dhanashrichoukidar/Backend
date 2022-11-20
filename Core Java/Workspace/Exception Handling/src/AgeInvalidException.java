//Custom Exception
public class AgeInvalidException extends Exception{

	 public void printError() {
		System.err.println("Invalid Age for Employee...");  //to print error msg in red used err method
	}
	
	
}