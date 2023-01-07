import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String[] b = new String[a];
        for(int i = 0; i < a; i++)
            b[i] = sc.nextLine();
        for(int i = 0; i < a; i++) {
            System.out.print(b[i].charAt(0));
            System.out.println(b[i].charAt(b[i].length() - 1));
        }
        sc.close();
    }
}