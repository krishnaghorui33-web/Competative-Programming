import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int krishna=sc.nextInt();
		while(krishna-->0){
		    int n=sc.nextInt();
		    List<Integer> a=new ArrayList<>();
		    int i;
		    int oc=0,fo=-1,lo=-1;
		    for(i=0;i<n;i++){
		        int k=sc.nextInt();
		        a.add(k);
		        if(a.get(i)%2!=0){
		            oc++;
		            if(fo==-1){
		                fo=i;
		            }
		            lo=i;
		        }
		        
		    }
		    if(oc%2==0){
		        System.out.println(n);
		    }
		    else{
		        int rl=n-fo-1;
		        int rr=lo;
		        System.out.println(Math.max(rl,rr));
		        
		    }
		}

	}
}
