import java.io.*;
import java.util.*;

public class Main {
    public static int white = 0;
    public static int blue = 0;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) 
                arr[i][j] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    if(arr[j][i] == 1 && arr[i][k] == 1)
                        arr[j][k] = 1;
                }
            }
        }
        for(int[] i : arr) {
            for(int j : i) 
                System.out.print(j + " ");
            System.out.println();
        }
    }
}