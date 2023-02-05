import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            int a = Integer.parseInt(br.readLine());
            for(int j = 0; j < a; j++) {
                st = new StringTokenizer(br.readLine());
                String input1 = st.nextToken();
                String input2 = st.nextToken();
                if(map.get(input2) == null) 
                    map.put(input2, 1);
                else
                    map.put(input2, map.get(input2) + 1);
            }
            int[] arr = new int[map.size()];
            int cnt = 0;
            for(String s : map.keySet()) {
                arr[cnt] = map.get(s);
                cnt++;
            }
            map.clear();
            cnt = 1;
            for(int j = 0; j < arr.length; j++) 
                cnt *= arr[j] + 1;
            sb.append((cnt - 1) + "\n");
        }
        System.out.println(sb);
    }

}