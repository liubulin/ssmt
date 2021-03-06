package com.zking.ssm.controller;

import sun.applet.Main;

/**
 * @authorLIUYINZI
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2020-12-07 18:09
 */
public class Sf {
    public static void main(String[] args){
        Sf sf = new Sf();
        int[] height = new int[4];
        System.out.println(sf.maxArea(height));
    }
    // 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
    // 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i,ai) 和 (i, 0)。
    // 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水
    //说明：你不能倾斜容器，且 n 的值至少为 2。

    public static int maxArea(int[] height) {
        // 暴力解法 O(n*n)
        /*
         * int max=0; for (int i = 0; i < height.length; i++) { for (int
         * j=i+1;j<height.length;j++){ int minHeight =
         * height[i]<height[j]?height[i]:height[j]; int length = j-i; max =
         * (minHeight*length)>max?(minHeight*length):max; } } return max;
         */

        // 双指针 一个放在开头，一个放在末尾，max保存目前的最大面积
        // 每次更新后，将较小的那条线往较大的线方向移动
        int max = 0, tmp = 0, i = 0, j = height.length - 1;
        int minHeight = 0, length = 0;
        while (i < j) {
            minHeight = height[i] < height[j] ? height[i] : height[j];
            length = j - i;
            tmp = minHeight * length;
            max = Math.max(max, tmp);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }



}
