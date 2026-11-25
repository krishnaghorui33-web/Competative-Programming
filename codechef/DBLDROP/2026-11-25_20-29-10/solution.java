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
		    long[] a=new long[n];
		    int i;
		    long sum=0;
		    long ans=0;
		    for(i=0;i<n;i++){
		        a[i]=sc.nextLong();
		        sum+=a[i];
		        
		    }
		    for(i=0;i<n;i++){
		        long mx=0;
		        for(int j=0;j<n;j++){
		            mx=Math.max(mx,i==j?2*a[j]:a[j]);
		        }
		            ans=Math.max(ans,sum+a[i]-mx);
		    }
		    System.out.println(ans);
		}

	}
}
