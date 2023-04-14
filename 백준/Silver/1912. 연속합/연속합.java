import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        int output = -2000, max = -2000;
        for(int i = 0; i < n; i++) {
            int input = Integer.parseInt(st.nextToken());
            max = Max(max + input, input);
            output = Max(output, max);
        }
        System.out.println(output);
    }

    static int Max(int a, int b) {
        return (a > b) ? a : b;
    }
}