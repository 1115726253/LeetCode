package com.niuke;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @program: LeetCode
 * @description: 明明的随机数
 * @author: 张召阳
 * @create: 2020-03-31 15:00
 **/

public class RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        while(scanner.hasNext()) {
            n = scanner.nextInt();
            Set<Integer> set = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                int i1 = scanner.nextInt();

                set.add(i1);
            }

            List<Integer> collect = set.stream().collect(Collectors.toList());
            collect.sort(Integer::compareTo);
            for (Integer i : collect) {
                System.out.println(i);
            }

        }

    }
}
