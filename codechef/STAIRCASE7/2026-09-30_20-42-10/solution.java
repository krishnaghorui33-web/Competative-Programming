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
		    int i;
		    for(i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    int mx=0;
		    Map<Integer,Integer> m=new HashMap<>();
		    for(i=0;i<n;i++){
		        int b=a[i]-i;
		        m.put(b,m.getOrDefault(b,0)+1);
		        mx=Math.max(mx,m.get(b));
		        
		    }
		    System.out.println(n-mx);
		}

	}
}
