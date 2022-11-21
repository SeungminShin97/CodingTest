import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String a = br.readLine();
        BigInteger total = new BigInteger("0");
        BigInteger m = new BigInteger("1234567891");
        long r = 31;
        for(int i = 0; i < n; i++) {
            BigInteger pow = new BigInteger("1");
            for(int j = 0; j < i; j++) 
                pow = pow.multiply(BigInteger.valueOf(r));
            total = total.add(BigInteger.valueOf(a.charAt(i) - '`').multiply(pow));
        }
        System.out.println(total.mod(m));
    }
}