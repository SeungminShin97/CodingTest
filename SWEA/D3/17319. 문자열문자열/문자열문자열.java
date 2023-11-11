import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        for(int i = 0; i < tc; i++) {
            sb.append("#").append(i + 1);
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            boolean compare = true;
            if(s.length() % 2 == 1) {
                sb.append(" No\n");
                continue;
            }
            for(int j = 0; j < (s.length() / 2); j++) {
                if(s.charAt(j) != s.charAt((s.length() / 2) + j))
                    compare = false;
            }
            if(compare)
                sb.append(" Yes\n");
            else
                sb.append(" No\n");
                
        }
        System.out.println(sb);
    }
}
