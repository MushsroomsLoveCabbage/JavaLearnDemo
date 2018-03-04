package com.zxy.learning.invoke;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo {
	public static void main(String[] args) throws Exception{
		User user = new User(1,"zxy","huaian");
		Object newUser = copyObject(user);		
		System.out.println(newUser.toString());
	}
	public static Object copyObject(Object obj) throws Exception{
		Class  clazz = obj.getClass();
		System.out.println(obj.getClass().getName());
		Field[] fields = clazz.getDeclaredFields();
	    Constructor<? extends Object> constructor = clazz.getConstructor(new Class[]{});
	    Object instance = constructor.newInstance(new Object[]{});
	    for(Field f : fields){
	    	String fname = f.getName();
	    	Class<?> type = f.getType();
	    	String setMethodName = "set" + fname.substring(0, 1).toUpperCase() + fname.substring(1);
	    	String getMethodName = "get" + fname.substring(0, 1).toUpperCase() + fname.substring(1);
	       
	      
	        Method getMethod = clazz.getDeclaredMethod(getMethodName, null);
	        Object gresult = getMethod.invoke(obj, null);
	        Method setMethod = clazz.getDeclaredMethod(setMethodName, new Class[]{getMethod.getReturnType()});
	        Object sresult = setMethod.invoke(obj, new Object[]{gresult});
	    }
		return instance;
	}
}
