import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int cnt = 0;
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();
            for(int j = 0; j < w; j++) {
                for(int k = 0; k < h; k++) {
                    cnt++;
                    if(cnt == n) {
                        System.out.printf("%d%02d\n", k + 1, j + 1);
                        k = w;
                        j = h;
                    }
                }
            }
        }
        sc.close();
    }
}