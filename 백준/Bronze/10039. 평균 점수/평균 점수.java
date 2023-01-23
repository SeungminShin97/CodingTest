import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++) 
            arr[i] = sc.nextInt();
        int total = 0;
        for(int i : arr) {
            if(i < 40)
                total += 40;
            else
                total += i;
        }
        System.out.println(total / 5);
    }
}
