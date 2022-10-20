import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextBigInteger().add(sc.nextBigInteger().add(sc.nextBigInteger())));
        sc.close();
    }
}