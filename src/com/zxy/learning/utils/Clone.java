package com.zxy.learning.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Clone {
	private Clone(){
		throw new AssertionError();
	}
	public static <T extends Serializable> T clone(T obj) throws IOException, ClassNotFoundException{
		ByteArrayOutputStream bout =  new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bout);
		oos.writeObject(obj);
		 
		ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
	    ObjectInputStream ois = new ObjectInputStream(bin);
	    return (T) ois.readObject();
	}
}
