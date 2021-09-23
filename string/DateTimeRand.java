package string;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;


public class DateTimeRand {
	public static void main(String[] args) 
	{
		Date date = new Date();
		
		DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
		
		String d = df.format(date);
		
		System.out.println(d);
		
		
		LocalTime time = LocalTime.now();
		
		DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm:ss");
		
		String t = time.format(tf);
		
		System.out.println(t);
		
		
		Random rand = new Random();
		
		int r = rand.nextInt(100);
		
		System.out.println(r);
	}

}
