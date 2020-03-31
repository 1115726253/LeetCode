package com.zhaoyang;

/**
 * @program: LeetCode
 * @description: 6. Z 字形变换
 * @author: 张召阳
 * @create: 2020-03-26 17:59
 **/

public class Zconvert {

    private char[] chars;

    int numRows;

    char[][] temp;

    int i = 0;
    int j = 0;
    int length;
    int index = 0;

    public String convert(String s, int numRows) {
        if(s.equals("")||numRows==1){
            return s;
        }
        this.numRows = numRows;
        temp = new char[numRows][s.length()];
        for (int i=0;i<temp.length;i++) {
            char[] chars = temp[0];
            for (int j=0;j<chars.length;j++) {
                temp[i][j] = '#';
            }
        }
        StringBuffer str = new StringBuffer();
        chars = s.toCharArray();
        length = s.length();
        xiangxia();
        for(int i=0;i<temp.length;i++){
            for(int j=0;j<temp[i].length;j++){
                char c = temp[i][j];
                if(c=='#'){
                    continue;
                }
                str.append(c);
            }

        }
        return str.toString();
    }

    void xiangxia() {
        if (length == 0) {
            return;
        }
        while (i < numRows - 1 && length > 0) {
            this.temp[i++][j] = chars[index++];
            length--;
        }
        xiangyou();
    }

    void xiangyou() {
        if (length == 0) {
            return;
        }
        while (i > 0 && length > 0) {
            temp[i--][j++] = chars[index++];
            length--;
        }
        xiangxia();
    }

    public static void main(String[] args) {
        String leetcodeishiring = new Zconvert().convert("A", 1);
        System.out.println(leetcodeishiring);
    }
}
