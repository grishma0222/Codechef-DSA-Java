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
 int score=0;
 for(int i=0;i<n-1;i++)
 {
     if(arr[i]==arr[i+1]){
         score++;
     }
 }
 int best=score;
 for(int i=0;i<n;i++)
 {
     int cur=score;
     if(i>0){
         if(arr[i-1]==arr[i]){cur--;}
         if(arr[i-1]==arr[i]+1){cur++;}
         
     }
     if(i<n-1)
     {
         if(arr[i]==arr[i+1]){cur--;}
         if(arr[i]+1==arr[i+1]){cur++;}
     }
 
 best=Math.max(best,cur);
 }
System.out.println(best);
}
	}
}
