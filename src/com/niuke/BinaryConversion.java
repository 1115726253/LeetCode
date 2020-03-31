package com.niuke;

import java.util.Scanner;

/**
 * @program: LeetCode
 * @description: 进制转换
 * @author: 张召阳
 * @create: 2020-03-31 15:53
 **/

public class BinaryConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String s = scanner.nextLine();
            String substring = s.substring(2);
            int length = substring.length();
            int ret = 0;
            for (int i = 0; i < length; i++) {
                char c = substring.charAt(i);
                int num = 0;
                if (c >= '0' && c <= '9') {
                    int tem = c - '0';
                    int v = tem * (int) Math.pow(16, length - i - 1);
                    num += v;
                } else {
                    int tem = getInt(c);
                    int v = tem * (int) Math.pow(16, length - i - 1);
                    num += v;
                }

                ret += num;
            }
            System.out.println(ret);
        }
    }
    private static int getInt(char c){
        int ret = 0;
        switch (c){
            case 'A':
                ret = 10;
                break;
            case 'B':
                ret = 11;
                break;
            case 'C':
                ret = 12;
                break;
            case 'D':
                ret = 13;
                break;
            case 'E':
                ret = 14;
                break;
            case 'F':
                ret = 15;
                break;
        }
        return ret;
    }
}
