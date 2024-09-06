import java.io.*;
import java.util.Scanner; 
class Add
{
	Scanner scan = new Scanner(System.in); 
	void sum() 
	{
		System.out.println("Input two integers");		
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.printf("sum : %d", a+b);
	}
	int sum(int a) 
	{
		System.out.println("Input an integer");
		int b = scan.nextInt();
		return a+b; 
	}
	int sum(int a, int b) 
	{
		return a+b;		
	}
	float sum(float d, float e) 
	{
		return d+e;		
	} 
}
class Addit
{
	public static void main(String[] args) 
	{
		System.out.println("\n************************************************************************");
		System.out.println("Select your choice");
		System.out.println("************************************************************************");
		System.out.println("Addition of Integers without parameters and return: 1");
		System.out.println("Addition of Integers with one parameter and return : 2");
		System.out.println("Addition of Integers with two parameters and return: 3");
		System.out.println("Addition of Floating points with two parameters and return: 4");
		System.out.println("************************************************************************\n");

		Scanner scan = new Scanner(System.in); 
    		int choice = scan .nextInt();
		Add ad= new Add();
		int a, b, c;
		switch(choice)
		{
         		case 1 :
				ad.sum();
            			break;
         		case 2 :
				System.out.println("Input an integer");		
				a = scan.nextInt();
				c = ad.sum(a);
				System.out.printf("sum : %d", c);
            			break;

         		case 3 :
				System.out.println("Input two integers");		
				a = scan.nextInt();
				b = scan.nextInt();
				c = ad.sum(a,b);
				System.out.printf("sum : %d", c);
            			break;
         		case 4 :
				System.out.println("Input two Floating point numbers");		
				float d = scan.nextFloat();
				float e = scan.nextFloat();
				float f = ad.sum(d,e);
				System.out.printf("sum : %f", f);
            			break; 
         		default :
         			System.out.println("Invalid input");
      		}
	}

}
