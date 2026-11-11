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
		    int s=sc.nextInt();
		    int[] a=new int[n];
		    int i,sa=0,sb=0,sm=0;
		    for(i=0;i<n;i++){
		        a[i]=sc.nextInt();
		        sa+=a[i];
		    }
		    for(i=0;i<n;i++){
		        int b=sc.nextInt();
		        sb+=b;
		        sm+=Math.min(a[i],b);
		    }
		    int x=s+sa;
		    int y=s+sb;
		    int z=2*s+sm;
		    int ans=Math.min(x,Math.min(y,z));
		    System.out.println(ans);
		}

	}
}
