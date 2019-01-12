package lab4;

import java.util.Scanner;

public class testEmployee {
	
	public static void main(String args[]) {
		
		Employee A=new Employee();
		Employee A2=new Employee();
		Scanner sc=new Scanner(System.in);
		hourlyWorker hw1=new hourlyWorker("Jim", 19, 2017, 10, 15.75);
		hourlyWorker hw2=new hourlyWorker();
		//String str;
		//A.Person();
		
		int i,x=0;
		
		//System.out.printf("Please enter the number of entries:");
		//i=sc.nextInt();
		
		//while(x<i) {
			
			//System.out.println("Please enter the name:");
			//A.setName(sc.next());
			//System.out.printf("Please enter the age:");
			//A.setAge(sc.nextInt());
			//System.out.printf("Please enter the Year hired:");
			//A.setYear_hired(sc.nextInt());
			
			//x++;
		//}
			
			A2.setAge(30);
			A2.setName("");
			A2.setYear_hired(1996);
			
		hw1.PayWorker();
		hw1.PayWorker();
		//System.out.println(A.toString()+"\n"+A2.toString());
		
			
		sc.close();
	}

}
