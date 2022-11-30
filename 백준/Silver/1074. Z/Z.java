import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static long cnt = 0;
    public static long z(long x, long y, long xlow, long xhigh, long ylow, long yhigh, long min, long max) {
        long n = 0;
        if(xhigh - xlow > 1) {
            if(x <= (xlow + xhigh) / 2 && y <= (ylow + yhigh) / 2) 
                n = z(x, y, xlow, (xlow + xhigh) / 2, ylow, (ylow + yhigh) / 2, min, min + (max - min + 1) / 4 - 1);
            if(x > (xlow + xhigh) / 2 && y <= (ylow + yhigh) / 2) 
                n = z(x, y, (xlow + xhigh) / 2 + 1, xhigh, ylow, (ylow + yhigh) / 2, min + (max - min + 1) / 4, min + (max - min + 1) / 2 - 1);
            if(x <= (xlow + xhigh) / 2 && y > (ylow + yhigh) / 2) 
                n = z(x, y, xlow, (xlow + xhigh) / 2, (ylow + yhigh) / 2 + 1, yhigh, min + (max - min + 1) / 2, min + (max - min + 1) / 4 * 3 - 1);
            if(x > (xlow + xhigh) / 2 && y > (ylow + yhigh) / 2) 
                n = z(x, y, (xlow + xhigh) / 2 + 1, xhigh, (ylow + yhigh) / 2 + 1, yhigh, min + (max - min + 1) / 4 * 3, max);
        }
        else {
            n = min;
            if(x == xhigh && y == ylow) n += 1;
            else if(x == xlow && y == yhigh) n += 2;
            else if(x == xhigh && y == yhigh) n += 3;
        }
        return n;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long r = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        long output = z(c, r, 0, (long)Math.pow(2, n) - 1, 0, (long)Math.pow(2, n) - 1, 0, (long)Math.pow(2, 2 * n) - 1);
        System.out.println(output);
    }
}