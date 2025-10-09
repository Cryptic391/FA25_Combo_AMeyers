
public class Time_driver {

	public static void main(String[] args) {
		Time time = new Time(11, 59, 59.9);
		Time time2 = new Time(12,40,23.2);
		Time time3 = new Time(23,59,59.9);
		Time time4 = new Time(0,0,0.1);
		
		time.printTime(time);
		String clock = time2.toString();
		
		
		System.out.println(clock);
		
		System.out.println(time3.equals(time2));
		System.out.println(time3.add(time4));
		
	}
}
