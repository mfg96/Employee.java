package lab4;

public class Person {
	
	protected String name="Private Contractor";
	protected int age=18;
	
	public Person() {
		
		name="Private Contractor";
		age=18;
	}
	
	public Person(String name, int age) {
		
		this();
		setName(name);
		setAge(age);
		
	}
	

	public String getName() {
	
			return name;
	}

	public void setName(String name) {
		if(name=="")
			this.name="Private contractor";
		else
			this.name = name;
	}

	public int getAge() {
		
			return age;
	}

	public void setAge(int age) {
		if(age>17&&age<150)
			this.age = age;
		else 
			this.age=18;
	}
	

}
