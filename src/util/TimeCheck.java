
package util;

/**
 * http://www.geocities.jp/turtle_wide/java/javamemo/timer.htm
 * 
 * 
 */
public class TimeCheck {
	
//	ArrayList<Long> lap_time = new ArrayList<Long>();
	long lap_time = 0;
	long start = 0;
	
	
	public void start() {
		start = System.currentTimeMillis();
	}

	public void lap() {
		lap_time = System.currentTimeMillis() - start;
		format(lap_time);
	}
	
	public void format(long _time) {
		int hour = (int)_time/1000/60/60;
		int min = (int)_time/1000/60%60;
		int sec = (int)_time/1000%60;
		int mill = (int)_time%1000;
		
		String str = "";
		str += Integer.toString(hour) + ":";
		str += Integer.toString(min) + ":";
		str += Integer.toString(sec) + ":";
		str += Integer.toString(mill);
		
		System.out.println(str);
	}
}
