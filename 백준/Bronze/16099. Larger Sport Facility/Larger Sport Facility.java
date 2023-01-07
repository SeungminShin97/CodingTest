import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger lt, wt, le, we; 
        for(int i = 0; i < n; i++) {
            lt = new BigInteger(sc.next());
            wt = new BigInteger(sc.next());
            le = new BigInteger(sc.next());
            we = new BigInteger(sc.next());
            if(lt.multiply(wt).compareTo(le.multiply(we)) == -1)
                System.out.println("Eurecom");
            else if(lt.multiply(wt).compareTo(le.multiply(we)) == 1)   
                System.out.println("TelecomParisTech");
            else 
                System.out.println("Tie");

        }
        sc.close();
    }
}