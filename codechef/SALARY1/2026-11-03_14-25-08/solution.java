import java.io.*;
import java.util.*;

class CodeChef {

     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
            String[] head = br.readLine().split(" ");
            int s = Integer.parseInt(head[0]);
            int b = Integer.parseInt(head[1]);
            int r= Integer.parseInt(head[2]);
            sb.append((long)s+((long)b*r)).append("\n");
        
        
        System.out.print(sb);
    }
    
}