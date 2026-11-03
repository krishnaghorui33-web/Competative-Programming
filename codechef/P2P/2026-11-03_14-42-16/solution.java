import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main(String[]args)throws IOException
	{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int t=Integer.parseInt(br.readLine().trim());
      while(t-->0){
      int n=Integer.parseInt(br.readLine().trim());
      String a=br.readLine().trim();
      String b =br.readLine().trim();
      int  noChoice1=0;
      int noChoice0=0;
      for(int i=0; i<n; i++){
          if(a.charAt(i)=='1' && b.charAt(i)=='1')noChoice1++;
           if(a.charAt(i)=='0' && b.charAt(i)=='0')noChoice0++;
      }
      int choice=n-noChoice1-noChoice0;
      if(noChoice1%2==0 && choice==0){
          System.out.println("No");
      }else{
              System.out.println("Yes");
          }
      }

	
	}
}