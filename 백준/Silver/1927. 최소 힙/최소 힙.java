import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseUnsignedInt(br.readLine());
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            if(input == 0) {
                if(map.size() == 0) 
                    sb.append("0\n");
                else {
                    sb.append(map.firstKey() + "\n");
                    if(map.get(map.firstKey()) > 1) 
                        map.put(map.firstKey(), map.get(map.firstKey()) - 1);
                    else 
                        map.remove(map.firstKey());
                }
            }
            else {
                if(map.get(input) == null) 
                    map.put(input, 1);
                else 
                    map.put(input, map.get(input) + 1);
            }
        }
        System.out.println(sb);
        map.clear();
    }
}
