package com.ddup.leetcode.other;

import java.util.Arrays;

/**
 * <p> 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 *          初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 *          你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * </p>
 *  输入:
 *  nums1 = [1,2,3,0,0,0], m = 3
 *  nums2 = [2,5,6],       n = 3
 *
 *  输出: [1,2,2,3,5,6]
 *
 *  [4,0,0,0,0,0]
 * 1
 * [1,2,3,5,6]
 * 5
 * @author chenglu
 * @date 2020/5/6
 */
public class MergeArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[] {3,7,0,0,0,0,0};
        merge(nums1, 2, new int[] {1,2,3,5,6}, 5);
        System.out.println(Arrays.toString(nums1));
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int k =  m-1, j = n - 1;
        for (int i = m + n - 1; i >= 0 ; i--) {
            if (j < 0) {
                break;
            }
            if (k < 0) {
                nums1[i] = nums2[j --];
                continue;
            }
            nums1[i] = nums1[k] > nums2[j] ? nums1[k--] : nums2[j--];
        }
    }
}
