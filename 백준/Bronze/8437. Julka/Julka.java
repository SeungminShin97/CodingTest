import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger sum = sc.nextBigInteger();
        BigInteger sub = sc.nextBigInteger();
        System.out.println(sum.subtract(sub).divide(BigInteger.valueOf(2)).add(sub));
        System.out.println(sum.subtract(sub).divide(BigInteger.valueOf(2)));
        sc.close();
    }
}