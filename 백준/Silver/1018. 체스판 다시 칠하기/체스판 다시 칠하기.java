import java.util.*;

public class Main {
    public static int count = 0;
    public static int finalcount = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();
        String[] nm = new String[n];
        for(int i = 0; i < n; ++i) {
            nm[i] = sc.nextLine();
        }
        for (int i = 7; i < n; i++) {
            for (int j = 7; j < m; j++) {
                for (int k = 0; k < 8; k++) {
                    Character firstch = (k % 2 == 1) ? 'B' : 'W';
                    for(int l = 0; l < 8; l += 2) {
                        if(nm[i - 7 + k].charAt(j - 7 + l) != firstch)
                            count++; 
                        Character firstch1 = (firstch == 'B') ? 'W' : 'B';
                        if(nm[i - 7 + k].charAt(j - 6 + l) != firstch1)
                            count++;
                    }
                }
                choice(count);
                count = 0;
                for (int k = 0; k < 8; k++) {
                    Character firstch = (k % 2 == 1) ? 'W' : 'B';
                    for(int l = 0; l < 8; l += 2) {
                        if(nm[i - 7 + k].charAt(j - 7 + l) != firstch)
                            count++; 
                        Character firstch1 = (firstch == 'B') ? 'W' : 'B';
                        if(nm[i - 7 + k].charAt(j - 6 + l) != firstch1)
                            count++;
                    }
                }
                choice(count);
                count = 0;
            }
        }
        System.out.println(finalcount);
        sc.close();
    }
    
    public static void choice(int a) {
        if(finalcount == -1)
            finalcount = a;
        else
            finalcount = (finalcount > a) ? a : finalcount;
    }
}