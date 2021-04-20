package com.ddup.leetcode.leetcode;

/**
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
 *
 * 示例:
 *
 * 输入: 38
 * 输出: 2
 * 解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-digits
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author chenglu
 * @date 2021-02-26 13:46
 */
public class Q258 {
    
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
    
    public static int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int val = 0;
        while (num > 0) {
            val += num%10;
            num = num/10;
        }
        return addDigits(val);
    }
}
