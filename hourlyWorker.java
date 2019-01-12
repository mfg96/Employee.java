package lab4;

public class hourlyWorker extends Employee {
	
	int num_hours;
	double hourly_rate;
	
	public hourlyWorker() {
		
		super();
		
	}
	
	hourlyWorker(String name, int age, int year_hired, int num_hours, double hourly_rate){
		
		super(name, age, year_hired);
		setNum_hours(num_hours);
		setHourly_rate(hourly_rate);
		
	}
	
	public int getNum_hours() {
		return num_hours;
	}
	public void setNum_hours(int num_hours) {
		if(num_hours>0)
			this.num_hours = num_hours;
		else
			this.num_hours=0;
	}
	public double getHourly_rate() {
		return hourly_rate;
	}
	public void setHourly_rate(double hourly_rate) {
		if(hourly_rate>0)
			this.hourly_rate = hourly_rate;
		else
			this.hourly_rate=0;
	}
	
	/**
	 * payworker method works as a toString to print pay of the worker
	 */
	
	public void PayWorker() {
	
		if((num_hours*hourly_rate)!=0)
			{System.out.println(""+name+" is an hourly worker and is paid "+(num_hours*hourly_rate)+" this week");
			num_hours=0;}
		else
			System.out.println("Jim has already been paid and need to work more hours this week.");
		
	}
	//public String toString() {
	
	//}
	
}
