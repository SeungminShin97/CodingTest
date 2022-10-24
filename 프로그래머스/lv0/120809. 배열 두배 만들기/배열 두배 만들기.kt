class Solution {
    fun solution(numbers: IntArray): IntArray {
        for(i in numbers.indices)
            numbers[i] *= 2
        return numbers
    }
}