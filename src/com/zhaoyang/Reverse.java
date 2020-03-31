package com.zhaoyang;

/**
 * @program: LeetCode
 * @description: 整数翻转
 * @author: 张召阳
 * @create: 2020-03-26 18:45
 **/

public class Reverse {
    int i;
    int j;

    public int reverse(int x) {
        if (x < 10 && x >= 0) {
            return x;
        }
        String strX = new Integer(x).toString();
        char[] chars = strX.toCharArray();
        i = 0;
        j = chars.length - 1;
        if (chars[0] == '-') {
            i++;
        }
        while (i < j) {
            jiaohuan(chars);
        }

        String s = String.valueOf(chars);
        try {
            Integer integer = new Integer(s);
            return integer.intValue();
        }catch (NumberFormatException e){
            return 0;
        }


    }

    void jiaohuan(char chars[]) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        i++;
        j--;
    }

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        int reverse1 = reverse.reverse(1534236469);
        System.out.println(reverse1);
    }
}
