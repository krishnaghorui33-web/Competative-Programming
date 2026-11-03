/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0){
		    int sum=0;
		    int N = sc.nextInt();
		    int K = sc.nextInt();
		    int V = sc.nextInt();
		    for(int j=0;j<N;j++){
		        int temp = sc.nextInt();
		        sum = sum + temp;
		    }
		    int value = ((N+K)*V)-sum;
		    if(value<=0)
		      System.out.println("-1");
		    else{
		        int check_decimal = (((N+K)*V)-sum)%K;
		        if(check_decimal==0)
		        {
		            System.out.println((((N+K)*V)-sum)/K);
		        }
		        else{
		            System.out.println("-1");
		        }
		    }
		      t--;
		}
	}
}