import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            long[] arr;
            if(a < 10) 
                arr = new long[10];
            else
                arr = new long[a];
            arr[0] = 1;
            arr[1] = 1;
            arr[2] = 1;
            arr[3] = 2;
            arr[4] = 2;
            arr[5] = 3;
            arr[6] = 4;
            arr[7] = 5;
            arr[8] = 7;
            arr[9] = 9;
            if(a > 10) {
                for(int j = 10; j < a; j++) {
                    arr[j] = arr[j - 1] + arr[j - 5];
                }
            }
            sb.append(arr[a - 1] + "\n");
        }
        System.out.println(sb);
    }

}