package assignment4;

import java.util.Date;
import java.util.regex.Pattern;

public class AgeCalculator2 {
	public int calculateAge(String date) throws Exception {
		Pattern datePattern = Pattern.compile("^\\d{2}/\\d{2}/\\d{4}$");	
		
		if(datePattern.matcher(date).matches()) {
			String[] arr = date.split("/");
			Date currDate = new Date(2021,7,17);
			int year = currDate.getYear();
			int currYear = year;
			int month = currDate.getMonth();
			int d = currDate.getDate();
			if(currYear < Integer.parseInt(arr[2])) {
				throw new InvalidDOBException();
			}else if(currYear == Integer.parseInt(arr[2])) {
				if(month < Integer.parseInt(arr[1])) {
					throw new InvalidDOBException();
				}else if(month == Integer.parseInt(arr[1])) {
					if(d < Integer.parseInt(arr[0])) {
						throw new InvalidDOBException();
					}else {
						return 0;
					}
				}else {
					return 0;
				}
			}else {
				return currYear - Integer.parseInt(arr[2]);
			}
			
			
		}else {
			throw new Exception();
		}
		
				
	}

}
