import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	
	while (T-- > 0) {
            int N = sc.nextInt(); 
            int[] modCount = new int[3]; 
            
            for (int i = 0; i < N; i++) {
                int num = sc.nextInt();
                modCount[num % 3]++;
            }
            if (modCount[0] > 0 || (modCount[1] > 0 && modCount[2] > 0) || modCount[1] >= 3 || modCount[2] >= 3) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            

	}
}
}