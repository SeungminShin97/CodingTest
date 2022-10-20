class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        denum1 = (denum1 * num2) + (denum2 * num1);
        num1 *= num2;
        int[] answer = {denum1 / gcd(denum1, num1), num1 / gcd(denum1, num1)};
        return answer;
    }
    public int gcd(int a, int b) {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
}