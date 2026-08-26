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
		    int j,m=-1;
		    for(i=0;i<n;i++){
		        for(j=i;j<n;j++){
		            int s=0;
		            if(i==j){
		               s=a[i]; 
		            }
		            else{
		                s=a[i]+a[j];
		            }
		            if(a[j]>=a[i] && s>m){
		                m=s;
		            }
		            
		        }
		    }
		    System.out.println(m);
		}

	}
}
