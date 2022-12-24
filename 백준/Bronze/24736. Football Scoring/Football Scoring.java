import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println((sc.nextInt() * 6 + sc.nextInt() * 3 + sc.nextInt() * 2 + sc.nextInt() + sc.nextInt() * 2));
        System.out.println((sc.nextInt() * 6 + sc.nextInt() * 3 + sc.nextInt() * 2 + sc.nextInt() + sc.nextInt() * 2));
        sc.close();
    }
}