import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	 Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int g = 0; g < t; g++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            Arrays.sort(a);
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if (a[i] > i + 1) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
	}
}