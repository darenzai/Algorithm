package 排序;

import java.util.Arrays;
import java.util.List;

public class 两个数组的交集2 {
    public static void main(String[] args) {
        int p[]={12,2,1,2};
        int p1[]={1,2};



        int[] ss=两个数组的交集2.intersect(p,p1);
        System.out.println(ss);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        //必须先排序
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0,k=0;
        /**
         * 类似归并排序的双工作指针
         * 1、当两者不同时，小的那个数组前进
         * 2、两者相同的时候，两者同时前进，且记录当前数字
         * 3、当一数组遍历完成时候推出循环（难点，有一个数组遍历完便可以结束循环）
         */
        while(i<nums1.length && j<nums2.length) {
            if(nums1[i]<nums2[j]) {
                i++;
            }else if(nums1[i]>nums2[j]) {
                j++;
            }else {
                nums1[k++]=nums1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }


}
