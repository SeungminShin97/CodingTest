import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n < 3) {
            if(n == 1) 
                System.out.println(1);
            else 
                System.out.println(3);
        }
        else {
            int[] arr = new int[n];
            arr[0] = 1;
            arr[1] = 3;
            for(int i = 2; i < n; i++) 
                arr[i] = (arr[i - 1] + (arr[i - 2] * 2)) % 10007;
            System.out.println(arr[n - 1]);
        }
    }
}
