import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int a1=sc.nextInt();
		    int a2=sc.nextInt();
		    int b1=sc.nextInt();
		    int b2=sc.nextInt();
		    int c1=sc.nextInt();
		    int c2=sc.nextInt();
		    int a=a1+a2;
		    int b=b1+b2;
		    int c=c1+c2;
		    int m=Math.max(a,Math.max(b,c));
		    System.out.println(m);
		}

	}
}
