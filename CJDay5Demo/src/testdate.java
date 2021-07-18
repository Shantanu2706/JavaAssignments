import java.util.*;
import java.text.SimpleDateFormat;

public class testdate {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.YEAR));
		String sDate1 = "15/07/2021";
		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		System.out.println(sDate1 + "\t" + date1.getYear());

	}

}
