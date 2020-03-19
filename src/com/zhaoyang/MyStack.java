package com.zhaoyang;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Auther: 张召阳
 * @Date: 2020/3/18 21:07
 * @Description: 使用队列实现栈
 */
public class MyStack {
    /**
     * Initialize your data structure here.
     */
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue1.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        int ret = 0;
        int size = queue1.size();
        for (int i = 0; i < size - 1; i++) {
            Integer poll = queue1.poll();
            queue2.add(poll);
        }
        ret = queue1.poll();

        while (!queue2.isEmpty()){
            Integer poll = queue2.poll();
            queue1.add(poll);
        }

        return  ret;
    }

    /**
     * Get the top element.
     */
    public int top() {
        int ret = 0;
        int size = queue1.size();
        for (int i = 0; i < size - 1; i++) {
            Integer poll = queue1.poll();
            queue2.add(poll);
        }
        ret = queue1.poll();
        queue2.add(ret);
        while (!queue2.isEmpty()){
            Integer poll = queue2.poll();
            queue1.add(poll);
        }

        return  ret;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        boolean empty = queue1.isEmpty();
        return empty;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        int pop = stack.pop();
        int pop1 = stack.pop();
        int pop2 = stack.pop();
        System.out.println(pop);
        System.out.println(pop1);
        System.out.println(pop2);
        int top = stack.top();
        System.out.println(top);
    }

}
