import java.io.*;
import java.util.*;

public class Main {
    public static int white = 0;
    public static int blue = 0;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) 
                arr[i][j] = Integer.parseInt(st.nextToken());
        }
        asdf(arr, 0, 0, n);
        System.out.println(white);
        System.out.println(blue);
    }
    public static void asdf(int[][] arr, int xlow, int ylow, int length) {
        int nw = 0, nb = 0;
        for(int i = xlow; i < xlow + length; i++) {
            for(int j = ylow; j < ylow + length; j++) {
                if(arr[i][j] == 0)
                    nw++;
                else
                    nb++;
            }
        }
        if(nb == 0) 
            white++;
        else if(nw == 0)
            blue++;
        else {
            int nlength = length / 2;
            asdf(arr, xlow, ylow, nlength);
            asdf(arr, xlow + nlength, ylow, nlength);
            asdf(arr, xlow, ylow + nlength, nlength);
            asdf(arr, xlow + nlength, ylow + nlength, nlength);
        }
    }
}