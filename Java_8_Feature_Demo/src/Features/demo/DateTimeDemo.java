package Features.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeDemo {
	
	public static void main(String[] args) {
		
		LocalDate d = LocalDate.now();
		LocalDate d1 = LocalDate.of(1987,8, 28); 
		LocalTime t = LocalTime.now();
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		LocalTime t1 = LocalTime.now(ZoneId.of("GMT+5"));
		System.out.println(d);
		System.out.println(d1);
		System.out.println(t);
		System.out.println(t1);
		
		
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}
	}

}
