import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 10; i++) {
            sb.append("#").append(i + 1).append(" ");
            br.readLine();

            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append((int)Math.pow(a, b)).append("\n");
        }

        System.out.println(sb);
    }
}
