import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] alpha = new int[26];
        int cnt = -1, output = 0, largecnt = 0;
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            if(Character.isLowerCase(input.charAt(i)))
                alpha[input.charAt(i) - 97]++;
            else
                alpha[input.charAt(i) - 65]++;
        }
        for(int i = 0; i < 26; i++) {
            if(alpha[i] > 0 && alpha[i] >= cnt) {
                if(alpha[i] > cnt) {
                    largecnt = 0;
                    output = i;
                }
                else if(alpha[i] == cnt)
                    largecnt++;
                cnt = alpha[i];
            }
        }
        System.out.println((largecnt > 0) ? "?" : (char)(output + 65));
        sc.close();
    }
}