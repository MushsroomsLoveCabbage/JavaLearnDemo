package com.zxy.learning.arithmetic.simple;

/**
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 * 解题思路，1）遍历一遍获取到总长度，然后在遍历来删除
 * 2）快慢遍历， 快的比慢的快 n 节点。
 */
public class removeNthFromEnd{
    /**
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode handle(ListNode head, int n) {
        ListNode tempHead =  new ListNode(0);
        tempHead.next = head;
        ListNode fastHead = tempHead, slowHead = tempHead;
        for(int i = 0; i < n; i++){
            fastHead = fastHead.next;
        }
        while (fastHead.next != null){
            fastHead = fastHead.next;
            slowHead = slowHead.next;
        }
        slowHead.next = slowHead.next.next;
        return tempHead.next;
    }
}
