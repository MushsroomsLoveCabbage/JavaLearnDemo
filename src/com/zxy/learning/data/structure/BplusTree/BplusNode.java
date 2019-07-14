package com.zxy.learning.data.structure.BplusTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName BplusNode.java
 * @Description TODO
 * @createTime 2019年03月12日 15:23:00
 */
public class BplusNode<K extends Comparable<K>, V> {

    /**是否叶子节点*/
    protected boolean isLeaf;

    /**是否根节点*/
    protected boolean isRoot;

    protected BplusNode<K, V> parent;

    protected BplusNode<K, V> previous;

    protected BplusNode<K, V> next;

    protected List<Entry<K, V>> entries;

    protected List<BplusNode<K, V>> children;

    public boolean isLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean leaf) {
        isLeaf = leaf;
    }

    public boolean isRoot() {
        return isRoot;
    }

    public void setRoot(boolean root) {
        isRoot = root;
    }

    public BplusNode<K, V> getParent() {
        return parent;
    }

    public void setParent(BplusNode<K, V> parent) {
        this.parent = parent;
    }

    public BplusNode<K, V> getPrevious() {
        return previous;
    }

    public void setPrevious(BplusNode<K, V> previous) {
        this.previous = previous;
    }

    public BplusNode<K, V> getNext() {
        return next;
    }

    public void setNext(BplusNode<K, V> next) {
        this.next = next;
    }

    public List<BplusNode<K, V>> getChildren() {
        return children;
    }

    public void setChildren(List<BplusNode<K, V>> children) {
        this.children = children;
    }

    public BplusNode(boolean isLeaf) {
        this.isLeaf = isLeaf;
        entries = new ArrayList<>();
        if(!isLeaf){
            children = new ArrayList<>();
        }
    }

    public BplusNode(boolean isLeaf, boolean isRoot) {
        this(isLeaf);
        this.isRoot = isRoot;
    }

    public V get(K key){
        //如果是叶子节点
        if(isLeaf){
            int low = 0, height = entries.size() - 1, mid, comp;
            while(low <= height){
                mid = (low + height)/2;
                comp = entries.get(mid).getKey().compareTo(key);
                if(comp == 0) {
                    return entries.get(mid).getValue();
                } else if(comp < 0){
                    low = mid + 1;
                } else {
                    height = mid - 1;
                }
            }
            return null;
        }
        //如果不是叶子节点
        //如果可以小于最左边的key
        if(key.compareTo(entries.get(0).getKey()) < 0) {
            return children.get(0).get(key);
        //如果大于等于右边最大的节点
        } else if (key.compareTo(entries.get(entries.size() -1).getKey()) >= 0){
            return children.get(children.size() - 1).get(key);
        //否则沿比可以大的前一个界子节点寻找
        } else {
            int low =0, high = entries.size() -1, mid = 0, comp;
            while (low <= high) {
                mid = (low + high) / 2;
                comp = entries.get(mid).getKey().compareTo(key);
                if (comp == 0) {
                    return children.get(mid + 1).get(key);
                } else if (comp < 0) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return children.get(low).get(key);
        }
    }

    public void insert(K key, V value, BplusTree<K, V> tree){

    }

}
