import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[4];
        for(int i = 0; i < 4; i++)
            num[i] = sc.nextInt();
        System.out.println(((num[0] * num[1]) + (num[2] * num[3])));
        sc.close();
    }
}