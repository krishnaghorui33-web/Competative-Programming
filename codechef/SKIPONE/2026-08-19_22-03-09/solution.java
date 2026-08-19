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
		    int c=sc.nextInt();
		    int[] a=new int[n];
		    int i;
		    for(i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    int x=0,f=0;
		    int mx=a[0];
		    for(i=0;i<n;i++){
		        mx=Math.max(a[i],mx);
		        f=f+a[i];
		        if(f-mx<=c){
		            x++;
		        }
		        else{
		            break;
		        }
		    }
		    System.out.println(x);
		}

	}
}
