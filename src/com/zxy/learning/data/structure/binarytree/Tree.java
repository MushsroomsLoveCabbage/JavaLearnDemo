package com.zxy.learning.data.structure.binarytree;

import jdk.nashorn.internal.ir.BinaryNode;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName Tree.java
 * @Description TODO
 * @createTime 2019年03月04日 10:54:00
 */
public interface Tree<T extends Comparable> {

    boolean isEmpty();

    int size();

    int height();

    String preOrder();

    String inOrder();

    String postOrder();

    String levelOrder();

    void insert(T data);

    void remove(T data);

    T findMax();

    T finMin();

    TreeNode findNode(T data);

    boolean contains(T data) throws Exception;

    void clear();
}
