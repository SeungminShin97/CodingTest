import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int title = 666;
        int length = 1;
        int count = 0;
        int[] asdf = {0, 0};
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            if(asdf[1] == -2) {
                String asdf0 = Integer.toString(asdf[0]);
                if(asdf0.length() >= 2) {
                    for(int j = asdf0.length() - 2; j >= 0; j--) {
                        if((asdf0.charAt(j) - '0') == 6) 
                            length ++;
                        else 
                            break;
                    }
                }
                int six = 0;
                for(int j = 0; j < length; j++) 
                    six = (int) Math.pow(10, j) * 6 + six;
                title = title + 1000 - six;
                asdf[1] = -1;
                asdf[0]++;
            } else if(asdf[1] == -1) {
                if(count < (int) Math.pow(10, length) - 1) {
                    title += 1;
                    count++;
                }
                else {
                    int three = 0;
                    for(int j = 0; j < length; j++) 
                        three = (int) Math.pow(10, j) * 3 + three;
                    title = title + 1000 - three;
                    length = 1;
                    count = 0;
                    asdf[1] = 0;
                    asdf[0]++;
                }
            }
            else {
                if(asdf[0] % 5 == 0 && asdf[0] % 10 == 5) {
                    asdf[1] = -2;
                    title += 1000;
                }
                else if(asdf[0] != 0) 
                    title += 1000;
                asdf[0]++;
            }
        }
        System.out.println(title);
        sc.close();
    }
}
