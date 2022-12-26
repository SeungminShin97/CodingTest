import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 8; i++) {
            int n = sc.nextInt();
            if(n != 0 && n != 1) {
                System.out.println("F");
                System.exit(0);
            }
        }
        System.out.println("S");
        sc.close();
    }
}