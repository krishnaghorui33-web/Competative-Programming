import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int t = sc.nextInt();
		int r = Math.abs(d - t);
		if(d > t){
		    System.out.println(r*1);
		}
		else{
		    System.out.println(r*0);
		}
	}
}