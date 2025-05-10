import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0;
        int pointer = 0;
        int temp = 0;
        for(int i = people.length - 1; i >= pointer; i--) {
            if(i == pointer) {
                answer++;
                break;
            }
            if(people[i] + people[pointer] <= limit) 
                pointer++;
            answer++;
        }
        return answer;
    }
}