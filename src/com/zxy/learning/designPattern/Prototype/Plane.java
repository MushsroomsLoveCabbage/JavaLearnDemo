package com.zxy.learning.designPattern.Prototype;

import java.io.*;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName Plane.java
 * @Description
 * @createTime 2019年08月17日 02:12:00
 */
public class Plane implements Cloneable, Serializable {

    @Override
    /* 浅复制 */
    public Object clone() throws CloneNotSupportedException {
        Plane proto = (Plane) super.clone();
        return proto;
    }

    /* 深复制(引用类型也是新的-> java 根据字节流生成新的对象) */
    public Object deepClone() throws IOException, ClassNotFoundException {

        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }


}
