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
		    int e=0,o=0;
		    for(i=0;i<n;i++){
		        if(a[i]%2==0){
		            e++;
		        }
		        else{
		            o++;
		        }
		    }int ans;
		    if(e<o){
		        ans=e+e+1;
		    }
		    else if(o<e){
		        ans=o+o+1;
		    }
		    else{
		        ans=o+e;
		    }
		    System.out.println(ans);
		    
		}

	}
}
