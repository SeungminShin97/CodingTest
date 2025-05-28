class Solution
{
    public int solution(int n, int a, int b)
    {
        int cnt = 1;
        while((a - 1) / 2 != (b - 1) / 2) {
            if(a % 2 == 1)
                a++;
            a /= 2;
            if(b % 2 == 1)
                b++;
            b /= 2;
            cnt++;
        }
        return cnt;
    }
}