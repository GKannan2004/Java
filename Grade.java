import java.io.*;
import java.util.Scanner; 
class Grade
{
	public static void main(String args[]) 
	{
		int java, fds, mds, stat;
      		Scanner scan = new Scanner(System.in);

  		System.out.println("Enter the student\'s name:");
      		String name = scan.nextLine();
  		System.out.println("Enter the student\'s reg Number:");
      		String roll = scan.nextLine();
  		System.out.println("Enter the mark obtained for Java:");
      		java = scan.nextInt();
		if (java>100)
		{	
		     System.out.println("Mark cannot be greater than 100");
		     java = scan.nextInt();
		}
  		System.out.println("Enter the mark obtained for FDS:");
      		fds = scan.nextInt();
		if (fds>100)
		{	
		     System.out.println("Mark cannot be greater than 100");
		     fds = scan.nextInt();
		}
  		System.out.println("Enter the mark obtained for MDS:");
      		mds = scan.nextInt();
		if (mds>100)
		{	
		     System.out.println("Mark cannot be greater than 100");
		     mds = scan.nextInt();
		}
  		System.out.println("Enter the mark obtained for Statistics:");
      		int stat = scan.nextInt();
		if (stat>100)
		{	
		     System.out.println("Mark cannot be greater than 100");
		     stat = scan.nextInt();
		}
		int total = java+fds+mds+stat;
		float average = total/4;

      		char grade;
		String remark;

		if(average>=80 & java>=40 & fds>=40 & mds>=40 & stat>=40)
		{
         		grade = 'A';
      		}
		else if(average>=60 && average<80 & java>=40 & fds>=40 & mds>=40 & stat>=40)
		{
         		grade = 'B';
      		}
      		else if(average>=50 && average<60 & java>=40 & fds>=40 & mds>=40 & stat>=40)
		{
         		grade = 'C';
      		}
      		else if(average>=40 && average<50 & java>=40 & fds>=40 & mds>=40 & stat>=40)
		{
         		grade = 'D';
      		}
		else
		{
			grade = 'F';	
		}
         	System.out.println("\n*********************************");
         	System.out.println("Name\t\t:" +name);
         	System.out.println("Reg No\t\t:" +roll);
         	System.out.println("Java\t\t:" +java);
         	System.out.println("FDS\t\t:" +fds);
         	System.out.println("MDS\t\t:" +mds);
         	System.out.println("Statistics\t:" +stat);
         	System.out.println("Total\t\t:" +total);
        	System.out.println("Average\t\t:" +average);
         	System.out.println("Grade\t\t:" +grade);
      		switch(grade) 
		{
         		case 'A' :
				System.out.println("Remark\t\t:Excellent");
            			break;
         		case 'B' :
				System.out.println("Remark\t\t:Very Good");
            			break;
         		case 'C' :
				System.out.println("Remark\t\t:Good");
            			break;
         		case 'D' :
				System.out.println("Remark\t\t:Passed");
            			break;
			case 'F' :
				System.out.println("Remark\t\t:Reappear");
            			break;
         		default :
         			System.out.println("Remark\t\t:Invalid");
      		}
         	System.out.println("*********************************");
	
   }
}