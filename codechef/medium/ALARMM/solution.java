import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    String s=sc.next();
		    int count=0;
		    int isp=-1;
		    for(int i=0;i<n;i++)
		    {
		        if(s.charAt(i)=='1' && i>isp){
		            count++;
		            isp =i+k;
		        }
		    }
		    System.out.println(count);
		}
	}
}
