package com.zxy.learning.data.structure.BplusTree;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName BplusTree.java
 * @Description TODO
 * @createTime 2019年03月12日 14:13:00
 */
public class BplusTree <K extends Comparable<K>, V> {

    /**根节点*/
    protected BplusNode<K, V> root;

    /**阶数，M值*/
    protected int order;

    /**叶子节点的链表头*/
    protected BplusNode<K, V> head;

    /**树高*/
    protected int height = 0;

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public BplusNode<K, V> getRoot() {
        return root;
    }

    public void setRoot(BplusNode<K, V> root) {
        this.root = root;
    }

    public BplusNode<K, V> getHead() {
        return head;
    }

    public void setHead(BplusNode<K, V> head) {
        this.head = head;
    }
}
