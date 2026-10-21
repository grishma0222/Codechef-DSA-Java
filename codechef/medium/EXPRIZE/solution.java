import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
    long n=sc.nextLong();
    long low=0;
    long high=2000000;
    long ans=0;
    while(low<=high)
    {
        long mid=low+(high-low)/2;
        long sum=mid*(mid*mid+5)/6;
        if(sum<=n)
        {ans=mid;
        low=mid+1;
    }
    else{
        high=mid-1;
    }
}
System.out.println(ans);
	}
}
    
}
