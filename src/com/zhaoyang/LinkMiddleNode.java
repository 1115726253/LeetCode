package com.zhaoyang;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 链表中间节点
 * @author: 张召阳
 * @create: 2020-03-23 18:41
 **/

public class LinkMiddleNode {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode middleNode(ListNode head) {

        ListNode temp = head;
        List<ListNode> list = new ArrayList<>();
        while (temp != null) {
            list.add(temp);
            temp = temp.next;
        }
        int count = list.size();
        int index = count / 2;

        if(count == 1){
            return list.get(0);
        }
        return list.get(index);

    }

    ListNode createNodeList(){
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        return listNode;
    }

    public static void main(String[] args) {
        LinkMiddleNode linkMiddleNode = new LinkMiddleNode();
        ListNode nodeList = linkMiddleNode.createNodeList();
        ListNode listNode = linkMiddleNode.middleNode(nodeList);
        System.out.println(listNode.val);

    }
}
