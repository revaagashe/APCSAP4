package journals;

public class Time {
	double hours;
	double minutes;
	double seconds;
	public Time(){
		setTime(35345345);
	}
	
	public Time(int hr, int min, int sec ){
		hours = hr;
		minutes = min;
		seconds = sec;
	}
	
	public void setTime(long elapseTime){
		hours = Math.floor(elapseTime/3600000);
		minutes = Math.floor((elapseTime%3600000)/6000);
		seconds = elapseTime - (3600000*hours) - (6000*minutes);
	}
}
