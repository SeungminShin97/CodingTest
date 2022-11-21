class Solution {
    public int divisorNum(int a) {
        int cnt = 0;
        int n = (int)Math.sqrt(a);
        for(int i = 0; i < n; i++) {
            if(a % (i + 1) == 0) {
                if(a / (i + 1 ) == i + 1)
                    cnt += 1;
                else 
                    cnt += 2;
            }
        }
        return cnt;
    }
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 0; i < number; i++) {
            int num = divisorNum(i + 1);
            if(num <= limit)
                answer += num;
            else
                answer += power;
        }
        return answer;
    }
}