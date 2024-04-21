package maventesting;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample1 {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println("date: "+date);
		SimpleDateFormat sformat=new SimpleDateFormat("dd/mm/yyyy");
		String formattedDate=sformat.format(date);
		System.out.println("formatedDate: "+formattedDate);
		
		System.out.println("5 days back date: "+DateUtility.getRequiredDateBasedOnNumberOfDays("dd/MM/yyyy", -5));
		System.out.println("10 days fature date: "+DateUtility.getRequiredDateBasedOnNumberOfDays("dd/MM/yyyy", 10));
		
		System.out.println("2 months back date: "+DateUtility.getRequiredDateBasedOnNumberOfMonths("dd/MM/yyyy", -2));
		System.out.println("3 months fature date: "+DateUtility.getRequiredDateBasedOnNumberOfMonths("dd/MM/yyyy", 3));
		
		System.out.println("1 years back date: "+DateUtility.getRequiredDateBasedOnNumberOfYears("dd/MM/yyyy", -1));
		System.out.println("2 years fature date: "+DateUtility.getRequiredDateBasedOnNumberOfYears("dd/MM/yyyy", 2));

	}

}
