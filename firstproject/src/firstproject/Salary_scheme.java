package firstproject;
import java.util.Scanner;
public class Salary_scheme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	Scanner scanner=new Scanner(System.in);
	//input the number of employees using a do while loop
	int numberOfEmployees;
	do {
	System.out.print("Enter the number of employees(positive number):");
		numberOfEmployees=scanner.nextInt();
	}while(numberOfEmployees<=0);
	 String[]employeeNames=new String[numberOfEmployees];
	double[]salaries=new double[numberOfEmployees];
	//input employee names and salaries using a for loop
	for(int i=0;i<numberOfEmployees;i++)
	 {
	  System.out.print("Enter name for employee"+(i+1)+":");
	 employeeNames[i]=scanner.next();
	System.out.print("Enter salary for"+employeeNames[i]+":");
   salaries[i]=scanner.nextDouble();
	}
		 //Display the salaries at the end of the month using a while loop
		 int i=0;
         System.out.println("\nSalaries at the end of the month:");
		  while(i<numberOfEmployees) {
		System.out.println("Employee:"+employeeNames[i]+",Salary:"+salaries[i]);
			  i++;
	}
				  scanner.close();
		}


}

