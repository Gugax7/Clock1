package timeDate;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Time {
	public static Thread thread;
	public static void main(String[]args) {
		thread = new Thread();
		SimpleDateFormat data1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date x1 = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(x1);
		System.out.println("x1 = " + data1.format(x1));
		while(1 == 1) {
			try {
				thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			cal.add(Calendar.SECOND, 1);
			x1 = cal.getTime();
			System.out.println("x1 = " + data1.format(x1));
		}
	}

}
