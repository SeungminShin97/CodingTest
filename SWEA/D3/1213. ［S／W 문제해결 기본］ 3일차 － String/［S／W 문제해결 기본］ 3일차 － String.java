import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 10; i++) {
            sb.append("#").append(i + 1).append(" ");
            br.readLine();

            String target = br.readLine();
            String words = br.readLine();

            int sum = words.length() - words.replace(target, "").length();

            sb.append(sum / target.length()).append("\n");
        }

        System.out.println(sb);
    }
}
