package leetcodeTest;

import java.util.ArrayList;
import java.util.Arrays;

/*
217. 存在重复元素
给定一个整数数组，判断是否存在重复元素。

如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。



示例 1:

输入: [1,2,3,1]
输出: true
示例 2:

输入: [1,2,3,4]
输出: false
示例 3:

输入: [1,1,1,3,3,4,3,2,4,2]
输出: true
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        if (nums.length<=1){
            return false;
        }
        for (int i=1;i<nums.length;i++){
            if (nums[i]==nums[i-1]){
                return true;
            }
        }
       return false;
    }

    public static void main(String[] args) {
        int[] ints = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(new ContainsDuplicate().containsDuplicate(ints));
    }
}
