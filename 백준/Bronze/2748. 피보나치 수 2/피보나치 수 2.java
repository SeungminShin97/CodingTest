import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        if(n == 0)
            System.out.println(0);
        else if(n == 1)
            System.out.println(1);
        else {
            long[] arr = new long[(int) (n + 1)];
            arr[0] = 0;
            arr[1] = 1;
            for(int i = 2; i <= n; i++) 
                arr[i] = arr[i - 1] + arr[i - 2];
            System.out.println(arr[(int) n]);
        }
    }
}