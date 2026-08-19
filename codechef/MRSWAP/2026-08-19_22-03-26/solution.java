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
		while(t-->0){
		    int n=sc.nextInt();
		    int[] a=new int[2*n];
		    int i,s=0;
		    for(i=0;i<2*n;i++){
		        a[i]=sc.nextInt();
		    }
		    for(i=0;i<n;i++){
		       s=s+Math.max(a[i],a[(2*n)-i-1]);
		    }
		    System.out.println(s);
		}

	}
}
