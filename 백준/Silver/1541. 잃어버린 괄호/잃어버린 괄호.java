import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static int point = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int cnt = Integer.parseInt(Sp(s));
        while(point < s.length()) {
            if(Sp(s).equals("+"))
                cnt += Integer.parseInt(Sp(s));
            else {
                int num = Integer.parseInt(Sp(s));
                while(point < s.length()) {
                    if(Sp(s).equals("+")) 
                        num += Integer.parseInt(Sp(s));
                    else {
                        point--;
                        break;
                    }
                }
                cnt -= num;
            }
        }
        System.out.println(cnt);
    }
    public static String Sp(String s) {
        if(s.charAt(point) == '+') {
            point++;
            return "+";
        }
        else if(s.charAt(point) == '-') {
            point++;
            return "-";
        }
        else {
            int num = 0;
            while(s.charAt(point) != '+' && s.charAt(point) != '-') {
                num *= 10;
                num += (s.charAt(point) - '0');
                point++;
                if(point >= s.length() || s.charAt(point) == '\n')
                    break;
            }
            return Integer.toString(num);
        }
    }
}
