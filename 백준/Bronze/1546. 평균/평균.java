import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        int m = 0;
        for(int i : array)
            if(i > m)
                m = i;
        float mean = 0;
        for(int i : array) 
            mean += i*100.0/m;
        mean /= n;
        System.out.println(mean);
        sc.close();
    }
}