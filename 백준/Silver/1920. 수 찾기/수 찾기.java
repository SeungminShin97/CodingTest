import java.util.*;

public class Main {
    private static List<Integer> arr;
    public static int Search(int a) {
        int low = 0, high = arr.size(), mid;
        while(high > low) {
            mid = (high + low) / 2;
            if(arr.get(mid) == a) 
                return 1;
            else if(arr.get(mid) > a)
                high = mid;
            else
                low = mid + 1;
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new ArrayList<>(n);
        while(n --> 0) {
            arr.add(sc.nextInt());
        }
        arr.sort(Comparator.naturalOrder());
        int m = sc.nextInt();
        while(m --> 0) {
            System.out.println(Search(sc.nextInt()));
        }
        sc.close();
    }
}