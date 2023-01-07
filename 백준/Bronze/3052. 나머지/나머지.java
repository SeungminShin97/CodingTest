import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[42];
        for(int i = 0; i < 10; i++) 
            arr[sc.nextInt() % 42]++;
        int sum = 0;
        for(int i : arr)
            if(i > 0)
                sum++;
        System.out.println(sum);
        sc.close();
    }
}