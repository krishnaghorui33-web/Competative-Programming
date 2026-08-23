import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(2*Math.min((x+y)/3,y)+Math.max(((x+y)/3-y),0));
		}

	}
}