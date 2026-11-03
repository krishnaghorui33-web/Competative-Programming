import java.util.Scanner;
class Main{
 public static void main(String[] ar)
 {
  Scanner s=new Scanner(System.in);
  int t=s.nextInt();
  int k;
  for(k=1;k<=t;k++)
  {
      int n=s.nextInt();
      int k1=s.nextInt();
      int x=s.nextInt();
      if(x>=Math.pow(2,k1-1))
      System.out.println("Yes");
      else
      System.out.println("No");
  }
 }
}