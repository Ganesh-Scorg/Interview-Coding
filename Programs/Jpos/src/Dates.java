import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.concurrent.Callable;

public class Dates {
	public static void main(String... args) throws ParseException {
		  ArrayList<Date> date=new ArrayList<>();
		  SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		  Date date1=format.parse("02-12-2001");
		  Date date2=format.parse("12-09-1999");
		  Date date3=format.parse("13-11-2016");
		  date.add(date1);
		  date.add(date2);
		  date.add(date3);
		  Collections.sort(date);
		  date.forEach(action-> System.out.println(format.format(action)));
		}


	Callable<Integer> c;
	
}
