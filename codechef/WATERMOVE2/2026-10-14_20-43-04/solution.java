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
		    int k=sc.nextInt();
		    Integer[] a=new Integer[n];
		    int i;
		    for(i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    Arrays.sort(a,Collections.reverseOrder());
		    int ans=0;
		    for(i=0;i<=k&&i<n;i++){
		        ans+=a[i];
		        
		    }
		    System.out.println(ans);
		}

	}
}
