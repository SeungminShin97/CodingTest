import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] s = new String[t];
        int[] r = new int[t];
        for(int i = 0; i < t; i++){
            r[i] = sc.nextInt();
            s[i] = sc.nextLine();
        }
        for(int i = 0; i < t; i++) {
            for(int j = 1; j < s[i].length(); j++) {
                for(int k = 0; k < r[i]; k++) {
                    System.out.print(s[i].charAt(j));
                }
            }
            System.out.println();
        }
        sc.close();
    }
}