package com.zxy.learning.handler;

import org.apache.commons.lang3.RandomUtils;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName Message.java
 * @Description
 * @createTime 2020年10月21日 14:32:00
 */
public class Message implements Runnable {

    private int id;

    private int uid;

    //消息类型
    private int type;

    public Message(int id, int uid, int type) {
        this.id = id;
        this.uid = uid;
        this.type = type;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(RandomUtils.nextInt(0, 1000));
        }catch (Exception e){

        }
        System.out.println(toString() + " " + Thread.currentThread().getId());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"uid\":")
                .append(uid);
        sb.append(",\"type\":")
                .append(type);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
