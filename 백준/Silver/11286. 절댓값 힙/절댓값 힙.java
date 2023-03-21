import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> lower = new PriorityQueue<>();   // 양수   
        PriorityQueue<Integer> higher = new PriorityQueue<>(Collections.reverseOrder());  // 음수
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            if(input == 0) {
                if(lower.size() == 0 && higher.size() == 0)
                    sb.append("0\n");
                else {
                    if(lower.peek() == null) {
                        sb.append(higher.peek() + "\n");
                        if(map.get(higher.peek()) > 1)
                            map.put(higher.peek(), map.get(higher.peek()) - 1);
                        else {
                            map.remove(higher.peek());
                            higher.remove();
                        }
                    }
                    else if(higher.peek() == null) {
                        sb.append(lower.peek() + "\n");
                        if(map.get(lower.peek()) > 1)
                            map.put(lower.peek(), map.get(lower.peek()) - 1);
                        else {
                            map.remove(lower.peek());
                            lower.remove();
                        }
                    }
                    else {
                        if(lower.peek() < (higher.peek() * -1)) {
                            sb.append(lower.peek() + "\n");
                            if(map.get(lower.peek()) > 1)
                                map.put(lower.peek(), map.get(lower.peek()) - 1);
                            else {
                                map.remove(lower.peek());
                                lower.remove();
                            }
                        }
                        else {
                            sb.append(higher.peek() + "\n");
                            if(map.get(higher.peek()) > 1)
                                map.put(higher.peek(), map.get(higher.peek()) - 1);
                            else {
                                map.remove(higher.peek());
                                higher.remove();
                            }
                        }
                    }
                }
            }
            else {
                if(map.get(input) == null) {
                    map.put(input, 1);
                    if(input > 0)
                        lower.add(input);
                    else
                        higher.add(input);
                }
                else 
                    map.put(input, map.get(input) + 1);
            }
        }
        System.out.println(sb);
    }
}
