import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        c += n % 60;
        if(c >= 60) {
            c -= 60;
            b++;
        } 
        n /= 60;
        b += n % 60;
        if(b >= 60) {
            b -= 60;
            a++;
        }
        n /= 60;
        a += n % 24;
        if(a > 23) 
            a -= 24;
        System.out.println(a + " " + b + " " + c);
    }
}
