import java.io.*;
import java.util.Scanner; 
class Factorial 
{
   static int fact(int n) 
   {
	int result;
	if(n==1) return 1;
	result = fact(n-1) * n;
	return result;
   }
   public static void main(String args[]) 
   {
       	Scanner scan = new Scanner(System.in); 
	System.out.println("Enter the number");
    	int i = scan .nextInt();
	System.out.println("Factorial of " +i+ " is " + fact(i));
   }
}