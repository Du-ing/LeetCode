package T61交换数字;

/**
 * https://leetcode-cn.com/problems/swap-numbers-lcci/
 */

class Solution {
    public int[] swapNumbers(int[] numbers) {
        numbers[0] = numbers[0] + numbers[1];
        numbers[1] = numbers[0] - numbers[1];
        numbers[0] = numbers[0] - numbers[1];
        return numbers;
    }
}