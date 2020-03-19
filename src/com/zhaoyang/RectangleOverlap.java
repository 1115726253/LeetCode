package com.zhaoyang;

/**
 * @Auther: 张召阳
 * @Date: 2020/3/18 22:14
 * @Description: 判断矩形是否重叠
 */
public class RectangleOverlap {
    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int leftX1 = rec1[0];
        int leftY1 = rec1[1];
        int rightX1 = rec1[2];
        int rightY1 = rec1[3];

        int leftX2 = rec2[0];
        int leftY2 = rec2[1];
        int rightX2 = rec2[2];
        int rightY2 = rec2[3];
        // shang
        if (leftY1 >= rightY2) {
            return false;
        }
        //下
        if(rightY1<=leftY2){
            return false;
        }
        //左
        if(rightX1<=leftX2){
            return false;
        }
        //右
        if(leftX1>=leftX2){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] rect1 = {7, 8, 13, 15};

        int[] rect2 = {10, 8, 12, 20};

        System.out.println(isRectangleOverlap(rect1, rect2));
    }
}
