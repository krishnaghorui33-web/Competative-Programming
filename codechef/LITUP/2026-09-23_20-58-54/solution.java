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
		    int a=sc.nextInt();
		    int i,j;
		    int[] ar=new int[n];
		    for(i=0;i<n;i++){
		        ar[i]=sc.nextInt();
		    }
		    int ans=Integer.MAX_VALUE;
		    int b=4*a+2;
		    if(b<n){
		        System.out.println(-1);
		    }
		    else{
		        for(i=0;i<n;i++){
		            for(j=i+1;j<n;j++){
		                int l1=Math.max(0,i-a);
		                int r1=Math.min(n-1,i+a);
		                int l2=Math.max(0,j-a);
		                int r2=Math.min(n-1,j+a);
		                if(l1==0&&r1+1>=l2&&r2==n-1){
		                    ans=Math.min(ar[i]+ar[j],ans);
		                }
		            }
		        }
		        System.out.println(ans);
		    }
		}

	}
}
