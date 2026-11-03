/* package codechef; // don't place package name! */

import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T!=0){

		int N = sc.nextInt();
		int []arr = new int[N];
		for (int i=0; i<N; i++) {
		    arr[i] = sc.nextInt();
		}
		int half = N / 2;
		int cnt0 = 0;
		int cnt1 = 0;
		
		int scr = 0;
		
		for (int i=0; i<N; i++ ) {
		    if (arr[i] == 0) {
		        cnt0++;
		    }
		    else {
		        cnt1++;
		    }
		}
		int ops = Math.min(cnt1, cnt0);
		
		
		 scr = Math.min(ops , half );
		System.out.println(scr);
		
		T--;
		}
	}
}