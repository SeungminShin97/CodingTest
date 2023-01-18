import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseUnsignedInt(br.readLine());
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            for(int j = 0; j < n; j++) 
                arr[i][j] = s.charAt(j) - '0';
        }
        sb.append(quad(arr, 0, 0, n));
        System.out.println(sb);
    }
    public static String quad(int[][]arr, int xlow, int ylow, int length) {
        int white = 0, black = 0;
        for(int i = xlow; i < xlow + length; i++) {
            for(int j = ylow; j < ylow + length; j++) {
                if(arr[i][j] == 0)
                    white++;
                else   
                    black++;
            }
        }
        if(white == 0) 
            return "1";
        else if(black == 0) 
            return "0";
        else {
            int n = length / 2;
            StringBuilder sb = new StringBuilder();
            sb.append("(" + quad(arr, xlow, ylow, n));
            sb.append(quad(arr, xlow, ylow + n, n));
            sb.append(quad(arr, xlow + n, ylow, n));
            sb.append(quad(arr, xlow + n, ylow + n, n) + ")");
            return sb.toString();
        }
    }
}
