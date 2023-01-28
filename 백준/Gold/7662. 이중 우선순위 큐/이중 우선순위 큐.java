import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            TreeMap<Integer, Integer> tree = new TreeMap<>();
            int k = Integer.parseInt(br.readLine());
            for(int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                String s = st.nextToken();
                int n = Integer.parseInt(st.nextToken());
                if(s.equals("I")) {
                    if(!tree.containsKey(n)) 
                        tree.put(n, 1);
                    else 
                        tree.put(n, tree.get(n) + 1);
                }
                else if(!tree.isEmpty()) {
                    if(n == 1) {
                        if(tree.get(tree.lastKey()) > 1)
                            tree.put(tree.lastKey(), tree.get(tree.lastKey()) - 1);
                        else 
                            tree.remove(tree.lastKey());
                    }
                    else {
                        if(tree.get(tree.firstKey()) > 1)
                            tree.put(tree.firstKey(), tree.get(tree.firstKey()) - 1);
                        else
                            tree.remove(tree.firstKey());
                    }
                }
            }
            if(tree.isEmpty())
                sb.append("EMPTY\n");
            else
                sb.append(tree.lastKey() + " " + tree.firstKey() + "\n");
            tree.clear();
        }
        System.out.println(sb);
    }
}
