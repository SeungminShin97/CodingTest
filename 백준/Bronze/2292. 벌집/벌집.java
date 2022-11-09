import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dist = 1, room = 1;
        while(room < n) {
            room += 6 * dist;
            dist++;
        }
        System.out.println(dist);
        sc.close();
    }
}