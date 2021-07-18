package assignment3;

import java.util.Date;
import java.util.regex.Pattern;

public class AgeCalculator1 {
	public int calculateAge(String date) throws Exception {
		Pattern datePattern = Pattern.compile("^\\d{2}/\\d{2}/\\d{4}$");	
		
		if(datePattern.matcher(date).matches()) {
			String[] arr = date.split("/");
			Date currDate = new Date();
			int year = currDate.getYear();
			int currYear = year + 1900;
			return currYear - Integer.parseInt(arr[2]);
			
		}else {
			throw new Exception();
		}
		
				
	}

}
