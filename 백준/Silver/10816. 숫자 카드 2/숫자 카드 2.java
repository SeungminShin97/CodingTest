import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        TreeMap<Integer, Integer> map = new TreeMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(n --> 0) {
            int num = Integer.parseInt(st.nextToken());
            if(map.get(num) == null) 
                map.put(num, 1);
            else {
                map.put(num, map.get(num) + 1);
            }
        }
        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[m];
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++) {
            int input = Integer.parseInt(st.nextToken());
            sb.append((map.get(input) == null) ? "0 " : map.get(input) + " ");
        } 
        System.out.println(sb);
    }
}