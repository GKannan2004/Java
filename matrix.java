import java.io.*;
import java.util.Scanner;
class Matrix
{  
public static void main(String args[])
{  
Scanner scan = new Scanner(System.in);
System.out.println("Enter the dimension of the matrices:");
int n = scan.nextInt();
int a[][]=new int[n][n];    
int b[][]=new int[n][n];       
int c[][]=new int[n][n]; 
System.out.println("Input the elements of first matrix :");
for(int i=0;i<n;i++)
{    
	for(int j=0;j<n;j++)
	{    
		a[i][j]=scan.nextInt();
	}    
}
System.out.println("Input the elements of second matrix :");
for(int i=0;i<n;i++)
{    
	for(int j=0;j<n;j++)
	{    
		b[i][j]=scan.nextInt();  
	}    
}    
for(int i=0;i<n;i++)
{    
	for(int j=0;j<n;j++)
	{    
		c[i][j]=a[i][j]+b[i][j]; 
	}    
}
System.out.println("The elements of first matrix :");
for(int i=0;i<n;i++)
{    
	for(int j=0;j<n;j++)
	{    
		System.out.print(a[i][j]+"\t");    
	}    
	System.out.println();  
}
System.out.println("The elements of second matrix :");
for(int i=0;i<n;i++)
{    
	for(int j=0;j<n;j++)
	{    
		System.out.print(b[i][j]+"\t");    
	}    
	System.out.println();  
}
System.out.println("The sum of 2 matrices :");
for(int i=0;i<n;i++)
{    
	for(int j=0;j<n;j++)
	{    
		System.out.print(c[i][j]+"\t");    
	}    
	System.out.println();  
}    
}
}  