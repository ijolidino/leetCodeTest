import java.util.Arrays;

/*
合并两个有序数组
给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。

 

说明：

初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 

示例：

输入：
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

输出：[1,2,2,3,5,6]
 

提示：

-10^9 <= nums1[i], nums2[i] <= 10^9
nums1.length == m + n
nums2.length == n

作者：力扣 (LeetCode)
链接：https://leetcode-cn.com/leetbook/read/all-about-array/x9lhe7/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i=0;

        if (nums1.length!=0&&nums2.length!=0){
            for (int j=m;j<m+n;j++){
                nums1[j]=nums2[i];
                i++;
            }
            for (int a=0;a<m+n;a++){
                for (int b=a;b<m+n;b++){
                    if (nums1[a]>nums1[b]){
                        int temp=nums1[a];
                        nums1[a]=nums1[b];
                        nums1[b]=temp;
                    }
                }
            }
        }


    }


    public static void main(String[] args) {
        int[] ints = {1, 2, 9, 0, 0, 0};
        int[] ints1 = {2, 5, 6};
        new Merge().merge(ints,3,ints1,3);
        for (int i:
             ints) {
            System.out.print(i+",");
        }
    }
}
