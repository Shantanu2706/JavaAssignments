package exceptionAssignment;

public class MyException extends Exception{
	@Override
	public String toString() {
		return "Exception occured: Validation failed";
	}
	
}
