import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            int c1 = 0, c2 = 0, c3 = 0;

            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                if (x == 1) c1++;
                else if (x == 2) c2++;
                else c3++;
            }

            int deletions = 0;

            deletions += Math.min(c1, c3);

            if (c2 > 1) deletions += (c2 - 1);

            System.out.println(deletions);
        }

        sc.close();
    }
}