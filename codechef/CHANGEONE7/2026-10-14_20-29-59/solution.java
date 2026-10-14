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
		    int i;
		    List<Integer> p=new ArrayList<>();
		    for(i=0;i<n;i++){
		        int x=sc.nextInt();
		        p.add(x);
		    }
		    Collections.sort(p);
		    int c=((p.get(p.size()-1)-p.get(1))<=(p.get(p.size()-2)-p.get(0)))?p.get(p.size()-1)-p.get(1):p.get(p.size()-2)-p.get(0);
		    System.out.println(c);
		}

	}
}
