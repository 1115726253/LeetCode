package com.zhaoyang;

/**
 * @program: LeetCode
 * @description: 字符串转换整数
 * @author: 张召阳
 * @create: 2020-03-26 19:23
 **/

public class MyAtoi {
    public int myAtoi(String str) {

        int start = 0, end = 0;
        boolean isStart = false;
        String trim = str.trim();
        end = trim.length();
        if(trim.equals("")){
            return 0;
        }
        char t = trim.charAt(0);
        if (!((t >= '0' && t <= '9') || t == '-' || t == '+')) {
            return 0;
        }

        for (int i = 0; i < trim.length(); i++) {
            char c = trim.charAt(i);
            if (c == '+') {
                continue;
            }
            if (!((c >= '0' && c <= '9') || c == '-' )) {
                end = i;
                break;
            }
            if(c >= '0' && c <= '9'){
                isStart = true;
            }
        }
        if(!isStart){
            return 0;
        }
        String substring = trim.substring(start, end);
        try {
            return new Integer(substring).intValue();
        } catch (NumberFormatException e) {
            if (substring.charAt(0) == '-')
                return Integer.MIN_VALUE;
            else {
                return Integer.MAX_VALUE;
            }
        }


    }

    public static void main(String[] args) {
        int i = new MyAtoi().myAtoi("+");
        System.out.println(i);

    }
}
