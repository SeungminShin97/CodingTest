import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for(int i = 0; i < arr.length ; i++) 
            arr[i] = sc.nextInt();
        int search = sc.nextInt();
        int count = 0;
        for(int i : arr) {
            if(i == search)
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}