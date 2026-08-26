import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		while(k-->0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    PriorityQueue<int []> q=new PriorityQueue<>(Comparator.comparingInt(o->o[2]));
		    //PriorityQueue<Integer> pq=new PriorityQueue<>();
		    int m=Integer.MAX_VALUE;
		    boolean[][] vis=new boolean[x+1][y+1];
		    q.add(new int[]{0,0,0});
		    while(!q.isEmpty()){
		        int[] t=q.remove();
		        if(t[0]>x || t[1]>y){
		            continue;
		        }
		        if(vis[t[0]][t[1]]){
		            continue;
		        }
		        vis[t[0]][t[1]]=true;
		        if(t[0]==x && t[1]==y){
		            m=Math.min(m,t[2]);
		            break;
		        }
		        q.add(new int[]{t[0]+1,t[1],t[2]+a});
		        q.add(new int[]{t[0]+2,t[1],t[2]+a});
		        q.add(new int[]{t[0],t[1]+1,t[2]+b});
		        q.add(new int[]{t[0],t[1]+2,t[2]+b});
		        q.add(new int[]{t[0]+1,t[1]+1,t[2]+c});
		    }
		    System.out.println(m);
		}

	}
}
