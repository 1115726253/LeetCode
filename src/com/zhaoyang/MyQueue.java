package com.zhaoyang;

import java.util.Stack;

/**
 * @Auther: 张召阳
 * @Date: 2020/3/18 21:35
 * @Description: 使用栈实现队列
 */
public class MyQueue {
    /**
     * Initialize your data structure here.
     */
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stack1.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        int size = stack1.size();
        for (int i = 0; i < size - 1; i++) {
            Integer pop = stack1.pop();
            stack2.push(pop);
        }
        Integer pop1 = stack1.pop();

        while (!stack2.isEmpty()) {
            Integer pop = stack2.pop();
            stack1.push(pop);
        }
        return pop1;
    }

    /**
     * Get the front element.
     */
    public int peek() {
        int size = stack1.size();
        for (int i = 0; i < size - 1; i++) {
            Integer pop = stack1.pop();
            stack2.push(pop);
        }
        Integer pop = stack1.pop();
        stack2.push(pop);
        while (!stack2.isEmpty()){
            Integer pop1 = stack2.pop();
            stack1.push(pop1);
        }
        return pop;
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack1.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

        System.out.println(queue.peek());
        System.out.println(queue.peek());

    }
}
