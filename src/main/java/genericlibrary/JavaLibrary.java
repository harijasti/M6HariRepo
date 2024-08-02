package genericlibrary;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaLibrary
{

	/**
	 * this method helps to get Random Numbers
	 * @param bound
	 * @return
	 */
	public int generateRandomNumber(int bound)
	{
		Random r=new Random();
		int num=r.nextInt(bound);
		return num;
	}
	
	/**
	 * this method helps to handle Calendar
	 * @param formatType
	 * @return
	 */
	public String handleCalendar(String formatType)
	{
		Calendar c=Calendar.getInstance();
		Date d=c.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat(formatType);
		String date=sdf.format(d);
		return date;
	}
}
