package com.zxy.learning.data.structure.binarytree;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName TreeNode.java
 * @Description TODO (二叉树节点)
 * @createTime 2019年03月04日 10:41:00
 */
public class TreeNode<T> {

    private T data;

    private TreeNode<T> leftNode;

    private TreeNode<T> rightNode;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode<T> rightNode) {
        this.rightNode = rightNode;
    }
}
