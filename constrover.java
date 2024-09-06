import java.io.*;
import java.util.Scanner; 
class Sum
{
	int a, b;
	Scanner scan = new Scanner(System.in); 
	Sum() 
	{
		System.out.println("Input two integers");		
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.printf("sum : %d", a+b);
	}
	Sum(int a) 
	{
		System.out.println("Input an integer");		
		b = scan.nextInt();
		System.out.printf("sum : %d", a+b);
	}
	Sum(int a, int b) 
	{
		System.out.printf("sum : %d", a+b);	
	}
	Sum(float d, float e) 
	{
		System.out.printf("sum : %f", d+e);	
	} 
}
class Addition
{
	public static void main(String[] args) 
	{
		System.out.println"(\n***************************");
		System.out.println("Select your choice");
		System.out.println("***************************\n");
		System.out.println("Addition of Integers without parameters and return: 1");
		System.out.println("Addition of Integers with one parameter and return : 2");
		System.out.println("Addition of Integers with two parameters and return: 3");
		System.out.println("Addition of Floating points with two parameters and return: 4");
		System.out.println("***************************\n");

		Scanner scan = new Scanner(System.in); 
    		int choice = scan .nextInt();
		int a, b;
		switch(choice)
		{
         		case 1 :
				Sum ad= new Sum();
            			break;
         		case 2 :
				System.out.println("Input an integer");		
				a = scan.nextInt();
				Sum add= new Sum(a);
            			break;

         		case 3 :
				System.out.println("Input two integers");		
				a = scan.nextInt();
				b = scan.nextInt();
				Sum addit= new Sum(a,b);
            			break;
         		case 4 :
				System.out.println("Input two Floating point numbers");		
				float d = scan.nextFloat();
				float e = scan.nextFloat();
				Sum adition= new Sum(d,e);
            			break; 
         		default :
         			System.out.println("Invalid input");
      		}
	}
}
