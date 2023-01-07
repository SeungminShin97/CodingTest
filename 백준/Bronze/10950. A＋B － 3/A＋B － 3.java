import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[sc.nextInt()][2];
        for(int i = 0; i < arr.length; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        } 
        for(int i = 0 ; i < arr.length; i++) 
            System.out.println(arr[i][0] + arr[i][1]);
        sc.close();
    }
}