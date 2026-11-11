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
		    String s=sc.next();
		    int ans=0,i;
		    for(i=0;i<n;i++){
		        int num=(s.charAt(i)-'0')*10+(s.charAt((i+1)%n)-'0');
		        if(num%4==0){
		            ans++;
		        }
		        
		    }
		    System.out.println(ans);
		}

	}
}
