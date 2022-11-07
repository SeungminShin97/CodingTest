import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int low = 0, high = 0;
        long mean = 0;
        for(int i = 0; i < n; i++) {
            int input = sc.nextInt();
            list.add(input);
            mean += input;
            if(i == 0) {
                low = input;
                high = input;
            } else {
                low = (low > input) ? input : low;
                high = (high > input) ? high : input;
            }
            if(!map.containsKey(input))
                map.put(input, 1);
            else
                map.put(input,map.get(input) + 1);
        }
        Collections.sort(list);
        Iterator<Integer> keys = map.keySet().iterator();
        int[] keynum = new int[2];
        int valuecnt = 0;
        while(keys.hasNext()) {
            int key = keys.next();
            if(map.get(key) > valuecnt) {
                valuecnt = map.get(key);
                keynum[0] = key;
                keynum[1] = 4001;
            } else if(map.get(key) == valuecnt) {
                if(keynum[0] > key) {
                    if(keynum[1] == 4001){
                        keynum[1] = keynum[0];
                        keynum[0] = key;
                    } else {
                        keynum[1] = (keynum[0] > keynum[1]) ? keynum[1] : keynum[0];
                        keynum[0] = key;
                    }
                }
                else {
                    if(keynum[1] > key || keynum[1] == 4001)
                        keynum[1] = key;
                }
            }
        }
        
        System.out.println(Math.round((double)mean / n));
        System.out.println(list.get(n / 2));
        System.out.println((keynum[1] == 4001) ? keynum[0] : keynum[1]);
        System.out.println(high - low);
        
        
        sc.close();
    }
}