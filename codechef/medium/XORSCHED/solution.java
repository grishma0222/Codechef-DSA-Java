import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
	  long x=sc.nextLong();
	  long y=sc.nextLong();
	   long n=sc.nextLong();
	    long  z=x^y;
	    System.out.println(solve(29,true,0).best);
	}
	}
}
