import java.io.*;
import java.util.Scanner; 
class Employee
{	
	double bp, da, hra, cca, pf, gp, np;
	Scanner scan = new Scanner(System.in);
	void calc() 
	{
		da = bp*0.10;
		hra = bp*0.093;
		cca = bp*0.025;
		pf = bp*0.083;
		gp = bp+da+hra+cca;
		np = gp-pf;
	}
	void print(String name, String eid) 
	{
		System.out.println("\n******************************************");
 		System.out.println("Employee Name : " +name);
		System.out.println("Employee ID : " +eid);
		System.out.println("Basic Pay : " + String.format("%.2f", bp));
		System.out.println("DA : " + String.format("%.2f", da));
		System.out.println("HRA : " + String.format("%.2f", hra));
		System.out.println("CCA : " + String.format("%.2f", cca));
		System.out.println("GP : " + String.format("%.2f", gp));
		System.out.println("PF Deduction: " + String.format("%.2f", pf));
		System.out.println("Net Pay: " +np);
		System.out.println("******************************************");
	} 
}
class Emp
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); 

 		System.out.print("\nEmployee Name : ");
    		String name = scan.nextLine();

		System.out.print("Employee ID : ");
    		String eid = scan.nextLine();

		System.out.print("Basic Pay : ");
    		float bp = scan.nextFloat();

		Employee emp = new Employee();
		emp.bp = bp;
		emp.calc();
		emp.print(name, eid);
	}
}
		


