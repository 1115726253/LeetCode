package com.niuke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: LeetCode
 * @description: 字符串分割
 * @author: 张召阳
 * @create: 2020-03-31 15:23
 **/

public class StringDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strList = new String[2];

        for(int i=0;i<2;i++){
            strList[i] = scanner.nextLine();
        }

        List<String> list = new ArrayList<>();
        for (String s : strList) {
            if(s.length()<=8){
                list.add(addZero(s));
            }else{
                list.addAll(division(s));
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
    private static List<String> division(String s){
        List<String> list = new ArrayList<>();
        do{
            String substring = s.substring(0, 8);
            list.add(substring);
            s = s.substring(8);
        }while(s.length()>8);
        int i1 = 8 - s.length();
        for(int i=0;i<i1;i++){
            s = s+"0";
        }
        list.add(s);
        return list;
    }
    private static String addZero(String s){
        if(s.length() == 8){
            return s;
        }
        int i1 = 8 - s.length();
        for(int i=0;i<i1;i++){
            s = s+"0";
        }
        return s;
    }
}
