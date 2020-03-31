package com.zhaoyang;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 最长回文子串
 */
public class LongestPalindrome {
    /**
     * 返回字符串
     *
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        String string = method1(s);
        return string;
    }

    /**
     * 返回字符串所能组成的最大回文串
     *
     * @param s
     * @return
     */
    public int longestPalindrome1(String s) {
        int[] count = new int[128];
        char[] chars1 = s.toCharArray();
        for (char c : chars1) {
            count[c]++;
        }

        int ret = 0;

        for (int i = 0; i < count.length; i++) {
            if(count[i] == 0){
                continue;
            }
            int v = count[i];
            ret += v / 2 * 2;
            if (v % 2 == 1 && ret % 2 == 0) {
                ret++;
            }
        }
        return ret;
    }

    /**
     * 填充法
     *
     * @return
     */
    private String method1(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            sb.append("#");
            sb.append(s.charAt(i));
        }
        sb.append("#");
        int maxLen = 0;
        String maxStr = new String();
        char[] chars = sb.toString().toCharArray();
        for (int i = 1; i < chars.length; i++) {
            String temp = maxLenStr(chars, i);
            int t = temp.length();
            if (t > maxLen) {
                maxLen = t;
                maxStr = temp;
            }
        }
        return maxStr;
    }

    private String maxLenStr(char[] chars, int i) {
        int left = i - 1;
        int right = i + 1;

        while (left >= 0 && right < chars.length && chars[left] == chars[right]) {
            left--;
            right++;
        }
        left++;
        right--;
        StringBuffer ret = new StringBuffer();
        for (int j = left; j <= right; j++) {
            if (chars[j] == '#') {
                continue;
            }
            ret.append(chars[j]);
        }

        return ret.toString();
    }


    public static void main(String[] args) {
        String s = "abccccdd";
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        System.out.println(longestPalindrome.longestPalindrome1(s));
    }

}
