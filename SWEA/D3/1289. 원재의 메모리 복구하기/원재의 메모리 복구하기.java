import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int arr[][];
        int tc = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < tc; i++) {
            sb.append("#").append(i + 1).append(" ");
            int sum = 0;
            String s = br.readLine();
            char c = '0';
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(j) != c) {
                    sum++;
                    c = (s.charAt(j) == '0') ? '0' : '1';
                }
            }

            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}   
