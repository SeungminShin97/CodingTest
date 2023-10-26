import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            BigInteger a = new BigInteger(st.nextToken());
            BigInteger b = new BigInteger(st.nextToken());
            if(a.subtract(b).abs().compareTo(new BigInteger("1")) == 1)
                System.out.println("#" + (i + 1) + " 1");
            else
                System.out.println("#" + (i + 1) + " " + a.gcd(b));
        }
    }
}