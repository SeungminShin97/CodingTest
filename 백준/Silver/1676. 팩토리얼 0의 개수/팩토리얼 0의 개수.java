import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger cnt = new BigInteger("1");
        for(int i = 1; i <= n; i++) 
            cnt = cnt.multiply(new BigInteger(Integer.toString(i)));
        for(int i = cnt.toString().length() - 1; i >= 0; i--) {
            if(cnt.toString().charAt(i) != '0') {
                System.out.println(cnt.toString().length() - i - 1);
                System.exit(0);
            }
        }
        sc.close();
    }
}