package assignment4;

public class InvalidDOBException extends Exception{
	@Override
	public String getMessage() {
		return "Date of birth cannot be after current date";
	}
}
