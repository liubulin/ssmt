package com.zking.ssm.controller;

import lombok.ToString;
import sun.applet.Main;

import java.util.*;

/**
 * @authorLIUYINZI
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2020-11-30 20:07
 */
public class Zy {
    public static void main(String[] args){
        //System.out.println(UUID.randomUUID().toString());
//        Zy z = new Zy();
//        System.out.println(z.longestPalindrome("122134"));
        //System.out.println(z.lengthOfLongestSubstring("abcdefg"));

//        List a,b=new ArrayList();


//        int[] nums = { 1, 7, 6, 3, 2, 8 };
//        int[] twoSum = twoSum(nums, 9);
//        System.out.println(Arrays.toString(twoSum));

//        Zy z = new Zy();
//        //345
//        ListNode l1=new ListNode(45);
//        ListNode l2 =new ListNode(345);
//        ListNode listNode = z.addTwoNumbers(l1, l2);
//        System.out.println(listNode);


//        String str = "abc,12,3yy98,0";
//        String[]  strs=str.split(",");
//        for(int i=0,len=strs.length;i<len;i++) {
//            System.out.println(Arrays.toString(strs));
//        }

        }
  //  题目描述
//	给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//	你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
// public void demo1(){
//    int nums[]=new int[3];
//    nums[0]=2;
//    nums[1]=1;
//    nums[2]=3;
//    int target =3;

    //19285
    //target 10
    //return [0,1] [2,3]

//
//
// }
    public static int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x)) {
                System.out.println("oo"+x);
                indexs[1] = i;
                indexs[0] = map.get(x);
            }
            map.put(nums[i], i);
        }
        return indexs;
    }

    // 题目描述
    // 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] chars = s.toCharArray();
        int left = 0, right = 0, max = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (right < s.length()) {
            if (!map.containsKey(chars[right])) {
                map.put(chars[right], map.getOrDefault(chars[right], 0) + 1);
                right++;
                max = Math.max(right - left, max);
            } else {
                map.remove(chars[left++]);
            }
        }

        return max;
    }
   // 给出两个 非空 的链表用来表示两个非负的整数。
    // 其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//        ListNode dummy = new ListNode(0);
//        ListNode p = l1, q = l2, cur = dummy;
//        int carry = 0;
//
//        while (p != null || q != null) {
//            int x = (p != null) ? p.val : 0;
//            int y = (q != null) ? q.val : 0;
//            // 前一个的进位
//            int sum = x + y + carry;
//            // 有无进位，取值为0或1
//            carry = sum / 10;
//            cur.next = new ListNode(sum % 10);
//            cur = cur.next;
//            if (p != null) {
//                p = p.next;
//            }
//            if (q != null) {
//                q = q.next;
//            }
//        }
//        // 结束时有进位
//        if (carry > 0) {
//            cur.next = new ListNode(carry);
//        }
//        return dummy.next;
//    }

    // 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
        public String longestPalindrome(String s) {
            if(s.equals("")||s.length()==1)
                return s;
            int [][] dp=new int[s.length()][s.length()];
            char []num=s.toCharArray();
            int start=0;
            int maxLen=1;
            for(int i=0;i<s.length();i++)//进行初始化
            {
                dp[i][i]=1;
                if(i+1<s.length()&&num[i]==num[i+1])
                {dp[i][i+1]=1;  start=i;maxLen=2; }
            }
            // 必须先把相同字母的回文串去除，然后把len从2开始计算
            for(int len=2;len<num.length;len++)
            {
                for(int i=0;i<num.length;i++)
                {
                    if (i + len < num.length&&num[i] == num[i + len]) {
                        dp[i][i + len] = dp[i + 1][i + len - 1];//验证dp[i][i+len]是回文串
                        if (dp[i][i + len] ==1&& len + 1 > maxLen) {//记录下最长回文串的起始位置和长度
                            maxLen = len + 1;
                            start = i;
                        }
                    }

                }
            }
            return  new String(num,start,maxLen);
        }
    }


