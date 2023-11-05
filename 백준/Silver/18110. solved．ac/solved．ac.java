import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++) 
            arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int trim = (int) Math.round(n * 0.15);

        int sum = 0;
        for(int i = trim; i < n - trim; i++) 
            sum += arr[i];
        
        System.out.println((int) Math.round((sum * 1.0) / (n - trim - trim)));
    }
}