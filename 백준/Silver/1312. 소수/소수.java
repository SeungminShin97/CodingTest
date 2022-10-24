import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int output = 0;
        if(a == b)
            output = 0;
        else{
            if(a > b)
                a %= b;
            for(int i = 0; i < n; i++){
                output = ((a * 10) / b);
                a = (a * 10) % b;
            }
        }
        System.out.println(output);
        sc.close();
    }
}