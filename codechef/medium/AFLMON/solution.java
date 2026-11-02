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
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    Arrays.sort(arr);
	    int c=0;
	    for(int i=0;i<n;i++)
	    {
	        int right=n-i-1;
	        int left=i;
	        if(left<=right){
	            c++;
	        }
	    }
	    System.out.println(c);
	    	}

	}
}
