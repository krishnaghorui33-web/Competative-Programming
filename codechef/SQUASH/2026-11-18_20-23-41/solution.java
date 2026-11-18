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
		    String s=sc.next();
		    char[] c=s.toCharArray();
		    int i,m=0;
		    for(i=1;i<n;i++){
		        if(c[i]==c[i-1]){
		            m++;
		        }
		    }
		    if(n-k<=m){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}

	}
}
