import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        n = (n < a) ? n : a;
        a = Integer.parseInt(br.readLine());
        n = (n < a) ? n : a;
        int cola = Integer.parseInt(br.readLine());
        a = Integer.parseInt(br.readLine());
        cola = (cola < a) ? cola : a;
        System.out.println(n + cola - 50);
    }
}