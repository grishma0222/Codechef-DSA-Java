import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
double x=sc.nextDouble();
	double  y=sc.nextDouble();
	if(x%5==0 && x+0.50<=y)
	{
	    double res=y-x-0.50;
	    System.out.printf("%.2f",res);
	}
	else{
	    System.out.printf("%.2f",y);
	}

	}
}
