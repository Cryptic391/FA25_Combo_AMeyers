
public class Time {
	private int hour;
	private int minute;
	private double second;
	
	//default constructor
	public Time() {
		this.hour =0;
		this.minute=0;
		this.second=0.0;
	}
	
	//field(values) constructor
	public Time(int hour, int minute, double second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public double getSecond() {
		return second;
	}

	public void setSecond(double second) {
		this.second = second;
	}
	public static void printTime(Time t) {
		System.out.printf("%02d:%02d:%04.1f\n",t.hour, t.minute, t.second);
	}
	
	public boolean equals(Time that) {
		final double DELTA = 0.001;
		return this.hour == that.hour && this.minute == that.minute && Math.abs(this.second - that.second) < DELTA;
	}
	
	public Time add(Time that) {
		Time sum = new Time();
		sum.hour = this.hour + that.hour;
		sum.minute = this.minute + that.minute;
		sum.second = this.second + that.second;
		
		if(sum.second >= 60.0) {	
			sum.second -= 60.0;
			sum.minute ++;
		}
		if(sum.minute >= 60) {	
			sum.minute -= 60;
			sum.hour ++;
		}
		if(sum.hour >= 24) {	
			sum.hour -= 24;
		}
		return sum;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:%04.1f\n",this.hour,this.minute,this.second);
	}
	
	
	
	
}
