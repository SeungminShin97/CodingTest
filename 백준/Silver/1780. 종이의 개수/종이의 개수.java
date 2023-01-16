import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int a = 0;
    public static int b = 0;
    public static int c = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        StringTokenizer st;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) 
                arr[i][j] = Integer.parseInt(st.nextToken());
        }
        paper(arr, 0, 0, n);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    public static void paper(int[][] arr, int xlow, int ylow, int length) {
        int a1 = 0, b1 = 0, c1 = 0;
        for(int i = xlow; i < xlow + length; i++) {
            for(int j = ylow; j < ylow + length; j++) {
                if(arr[i][j] == -1)
                    a1++;
                else if(arr[i][j] == 0)
                    b1++;
                else if(arr[i][j] == 1)
                    c1++;
            }
        }
        if((a1 == 0 && b1 == 0) || (a1 == 0 && c1 == 0) || (b1 == 0 && c1 == 0)) {
            if(a1 > 0)
                a++;
            else if(b1 > 0)
                b++;
            else if(c1 > 0)
                c++;
        }
        else {
            int n = length / 3;
            for(int i = xlow; i < xlow + length; i += n) {
                for(int j = ylow; j < ylow + length; j += n) {
                    paper(arr, i, j, n);
                }
            }
        }
    }
}
