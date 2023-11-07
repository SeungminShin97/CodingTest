import java.io.*;
import java.util.*;


public class Main {
    public static int arr[];
    public static String input[];
    public static StringBuilder sb;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            input = br.readLine().split(" ");
            if(n > 32)
                sb.append("0\n");
            else {
                arr = new int[3];
                sb.append(dfs(n, 0, 0) + "\n");
            }
        }
        System.out.println(sb);
    }

    static int dfs(int n, int depth, int start) {
        int sum = 0;
        if(depth == 3) {
            sum += compare(input[arr[0]], input[arr[1]]) + compare(input[arr[1]], input[arr[2]]) + compare(input[arr[0]], input[arr[2]]);
            return sum;
        }
        sum = 1000;
        for(int i = start; i < n; i++) {
            arr[depth] = i;
            int a = dfs(n, depth + 1, i + 1);
            sum = (sum < a) ? sum : a;
        }
        return sum;
    }

    static int compare(String s1, String s2) {
        int sum = 0;
        for(int i = 0; i < 4; i++) {
            if(s1.charAt(i) != s2.charAt(i))
                sum++;
        }
        return sum;
    }
}


