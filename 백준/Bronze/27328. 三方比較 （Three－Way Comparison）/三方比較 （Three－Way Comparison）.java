import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        if(n > m)
            System.out.println(1);
        else if(n == m)
            System.out.println(0);
        else
            System.out.println(-1);
    }
}