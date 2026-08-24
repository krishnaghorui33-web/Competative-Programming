import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'downToZero' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int downToZero(int n) {
    // Write your code here
     Queue<int[]> q=new LinkedList<>();
     boolean[] v=new boolean[n+1];
     q.add(new int[]{n,0});
     v[n]=true;
     while(!q.isEmpty()){
        int[] t=q.remove();
        int val=t[0];
        int c=t[1];
        if(val==0){
            return c;
        }
        if(!v[val-1]){
            v[val-1]=true;
        q.add(new int[]{val-1,c+1});
        }
        for(int i=2;i*i<=val;i++){
            if(val%i==0){
                int y=Math.max(i,val/i);
                if(!v[y]){
                    v[y]=true;
                q.add(new int[]{y,c+1});
                }
            }
        }
     }
     
     return -1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = Result.downToZero(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
