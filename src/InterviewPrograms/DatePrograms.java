package InterviewPrograms;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatePrograms {

	public static void main(String[] args) {
	
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		System.out.println("___________OR_________");
		
		 LocalDateTime myDateObj = LocalDateTime.now();  
		    System.out.println("Before formatting: " + myDateObj);  
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
		    
		    String formattedDate = myDateObj.format(myFormatObj);  
		    System.out.println("After formatting: " + formattedDate);  
		  
		

	}

}
