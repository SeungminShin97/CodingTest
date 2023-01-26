import java.io.*;
import java.util.*;

public class Main {
    public static int white = 0;
    public static int blue = 0;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int io = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int cnt = 0;
        for(int i = 0; i < n - (2 * io); i++) {
            if(s.charAt(i) == 'I') {
                boolean bool = true;
                for(int j = 1; j <= (io * 2); j += 2) {
                    if(s.charAt(i + j) != 'O' || s.charAt(i + j + 1) != 'I')
                        bool = false;
                }
                if(bool)
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}