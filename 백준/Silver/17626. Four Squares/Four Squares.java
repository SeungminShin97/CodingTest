import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        arr[1] = 1;
        for(int i = 2; i <= n; i++) {
            int min = 5;
            for(int j = 1; j * j <= i; j++) {
                int m = arr[i - (j * j)];
                min = (min > m) ? m : min;
            }
            arr[i] = min + 1;
        }
        System.out.println(arr[n]);
    }
}