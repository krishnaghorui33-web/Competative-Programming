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
		    int b=sc.nextInt();
		    boolean[] arr=new boolean[n+1];
		    Arrays.fill(arr,true);
		    int i;
		    for(i=1;i<=a;i++){
		        int c=sc.nextInt();
		        arr[c]=false;
		    }
		    for(i=1;i<=n;i++){
		        if(b==0){
		            break;
		        }
		        if(arr[i]){
		            System.out.print((i)+" ");
		            b--;
		        }
		    }
		    System.out.println();
		}

	}
}
