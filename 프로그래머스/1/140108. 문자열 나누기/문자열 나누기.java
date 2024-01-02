class Solution {
    public int solution(String s) {
        char x = s.charAt(0);
        int xCount = 1;
        int yCount = 0;
        int answer = 0;
        
        for(int i = 1; i < s.length(); i++) {
            if(xCount == yCount) {
                x = s.charAt(i);
                xCount = 1;
                yCount = 0;
                answer++;
            }
            else {
                if(s.charAt(i) == x)
                    xCount++;
                else
                    yCount++;
            }
        }
        return answer + 1;
    }
}