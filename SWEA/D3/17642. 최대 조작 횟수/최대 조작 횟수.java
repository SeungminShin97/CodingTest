import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Long n = Long.parseLong(br.readLine());
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            Long a = Long.parseLong(st.nextToken());
            Long b = Long.parseLong(st.nextToken());

            System.out.print("#" + (i + 1) + " ");
            if(a > b || (b - a) == 1) {
                System.out.println("-1");
                continue;
            }
            if(a == b) {
                System.out.println("0");
                continue;
            }
            if((b - a) % 2 == 0)
                System.out.println((b - a) / 2);
            else 
                System.out.println((b - a - 1) / 2);
        }
    }
}