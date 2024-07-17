import java.util.Scanner;

public class student 
{
    public static void main(String[] args) 
	{
		int tday=180;
		Scanner val = new Scanner(System.in);
		System.out.println("enter your name :");
		String name = val.next();
		System.out.println("enter your department :");
		String dpt = val.next();
		Scanner deti = new Scanner(System.in);
		System.out.println("enter your roll number :");
		double roll=deti.nextDouble();
		Scanner mrk = new Scanner(System.in);
		System.out.println("enter your present days");
		int Pday=mrk.nextInt();
		
		
		
		if (Pday==tday)
		{   int percentage=(Pday*100)/tday;
			System.out.println("Wow you got  " + percentage+"%");
		    
		}
		else if (Pday>130 && Pday<179) 
		{
			int percentage=(Pday*100)/tday;
			System.out.println("congratulation");
			System.out.println("you got o grade at "+ percentage+"%");
		}
		else if(Pday>90 && Pday<130) 
		{
			int percentage=(Pday*100)/tday;
		    System.out.println("well doing ");
			System.out.println("you got a+ grade at "+ percentage+"%");
			
		}
		else if (Pday>60 && Pday<90)
		{ 
			int percentage=(Pday*100)/tday;
			System.out.println("nice : you need to  get more grade ");
			System.out.println("you got a grade at "+ percentage+"%");
		}
		else if (Pday>40 && Pday<60)
		{
			int percentage=(Pday*100)/tday;
			System.out.println("Not bad but you need to focus more ");
			System.out.println("you got b+ grade at  "+percentage+"%");
		}
		else if (Pday>30 && Pday<40) 
		{
			int percentage=(Pday*100)/tday;
			System.out.println(" average performance");
			System.out.println("you got b grade  at "+percentage+"%");
		}
		else if (Pday<30) 
		{
			int percentage=(Pday*100)/tday;
			System.out.println(" average performance");
			System.out.println("your grade is less than 30  at "+percentage+"%");
		}
		else 
		{System.out.println("invalid");
	    }
	}
    
}
