import java.util.*;
import java.io.*;

class Solution {
    public static int arr[];
    public static int count, max;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < tc; i++) {
            sb.append("#").append(i + 1).append(" ");
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            count = Integer.parseInt(st.nextToken());

            arr = new int[input.length()];
            for(int j = 0; j < input.length(); j++) 
                arr[j] = input.charAt(j) - '0';

            max = 0;
            dfs(0, 0);

            sb.append(max).append("\n");

        }
        System.out.println(sb);
    }

    static void dfs(int start, int depth) {
        if(depth == count || start == arr.length - 1) {
            if(start == arr.length - 1) {
                if((count - depth) % 2 == 1) {
                    int temp = arr[arr.length - 2];
                    arr[arr.length - 2] = arr[arr.length - 1];
                    arr[arr.length - 1] = temp;
                }
            }
            int sum = 0;
            for(int i = 0; i < arr.length; i++) {
                sum += arr[i];
                sum *= 10;
            }
            sum /= 10;
            max = (max > sum) ? max : sum;
            return;
        }
        for(int i = start; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                dfs(i, depth + 1);
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
  
}   
