/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)
	{
	   Scanner read = new Scanner(System.in);
        while (true) {
            int x = read.nextInt();
            if (x >= 0 && x <= 99) {
                if (x == 42) {
                    break;
                } else {
                    System.out.println(x);  
                }
            } else {
                System.out.println("Please enter a one- or two-digit number.");
            }
        }
        read.close(); 
    }
}