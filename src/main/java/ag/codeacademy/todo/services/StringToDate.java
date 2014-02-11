package ag.codeacademy.todo.services;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
	public static Date ConvertStringToDate(String stringDate) {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
		Date date = new Date();
		try {
			date = dateFormat.parse(stringDate);
			return date;
		} 
		catch(ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
}
