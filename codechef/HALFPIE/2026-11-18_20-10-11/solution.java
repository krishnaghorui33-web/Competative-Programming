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
		    int[] a=new int[n];
		    int i,s=0;
		    for(i=0;i<n;i++){
		        a[i]=sc.nextInt();
		        s+=a[i];
		    }
		    int m=Integer.MAX_VALUE;
		    for(i=0;i<n-1;i++){
		        int p=(a[i]+a[i+1])/2;
		        if(p<m){
		            m=p;
		        }
		        
		    }
		    System.out.println(s-m);
		}

	}
}
