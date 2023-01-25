import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a + b + c == 180) {
            if(a == b && b == c)
                System.out.println("Equilateral");
            else if(a == b || b == c || c == a)
                System.out.println("Isosceles");
            else
                System.out.println("Scalene");
        }
        else
            System.out.println("Error");
    }
}
