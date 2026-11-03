import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0)
		{
		    int d = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int count = 0;
		    double mem = x*1;
		    if(y>=x)
		    {
		        System.out.println("0");
		    }
		    else
		    {
		        if(d*y<100)
		        {
		            System.out.println("-1");
		        }
		        else
		        {
		                while(mem>y)
		                {
		                    y--;
		                    count++;
		                    mem = x - (d*count*x/100);
		                }
		                System.out.println(count);
		        }
		    }
		}

	}
}