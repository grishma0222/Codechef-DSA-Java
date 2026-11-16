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
	    String s=sc.next();
	    String r=sc.next();
	    StringBuilder s2=new StringBuilder();
	    for(int i=0;i<5;i++){
	        if(s.charAt(i)==r.charAt(i)){
	            s2.append('G');
	        }else{
	            s2.append('B');
	        }
	    }
	    System.out.println(s2);
	}
	}
}
