package lab4;

/**
 * Employee class
 * @author mfarazsohail
 * inherited from person
 */
public class Employee extends Person {
	
	int year_hired;
	int id;
	public static int counter=0;
	
	/**
	 * 
	 */
	public Employee() {
		
		
		year_hired=2018;
		id=counter+1;
		counter++;
	}
	
	/**
	 * employee overloaded constructor
	 * @param name
	 * @param age
	 * @param year_hired
	 */
	
public Employee(String name, int age, int year_hired) {
		
		super(name,age);
		setYear_hired(year_hired);
		
	}

	public Employee(Employee p) {
	
	name=p.getName();
	age=p.getAge();
	}
	
	public int getYear_hired() {
			return year_hired;
	}
	public void setYear_hired(int year_hired) {
		
		if(year_hired>1900&&year_hired<2999)
			this.year_hired = year_hired;
		else
			this.year_hired=2018;
	}
	public int getId() {
		return id;
	}
	public void setId(int counter) {
		this.id = counter+1;
	}
	
	protected void PayWorker() {
		
		System.out.println(""+name+" is an employee who needs to be paid. ");
	}
	
	public String toString() {
		
		return ""+name+" was hired in "+year_hired+" and is "+age+" years old and id is "+id+".";
	}
	

}
