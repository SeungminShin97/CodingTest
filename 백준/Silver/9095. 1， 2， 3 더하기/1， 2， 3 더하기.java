import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[11];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        for(int i = 3; i < 11; i++) 
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            sb.append(arr[a - 1] + "\n");
        }
        System.out.println(sb);
    }

}