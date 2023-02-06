import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long cnt = 1;
        for(int i = 1; i <= n; i++) {
            cnt *= i;
        }
        System.out.println(cnt);
    }
}