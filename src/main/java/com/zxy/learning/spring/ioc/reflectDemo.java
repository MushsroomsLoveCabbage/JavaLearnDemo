/**
 * Creation Date:2017年12月7日-上午11:11:21
 * 
 * 
 */
package com.zxy.learning.spring.ioc;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Description Of The Class<br/>
 * 
 * 
 * @author zxy
 * @Connect Mail:1363320658@qq.com
 * @version 1.0.0, 2017年12月7日-上午11:11:21
 * @since 2017年12月7日-上午11:11:21
 */
public class reflectDemo {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class c = Bean.class;
		Field[] fs = c.getDeclaredFields();
		StringBuffer sb = new StringBuffer();
		sb.append(Modifier.toString(c.getModifiers()) + " class " + c.getSimpleName() + "{\n");
		// 里边的每一个属性
		for (Field field : fs) {
			sb.append("\t");// 空格
			sb.append(Modifier.toString(field.getModifiers()) + " ");// 获得属性的修饰符，例如public，static等等
			sb.append(field.getType().getSimpleName() + " ");// 属性的类型的名字
			sb.append(field.getName() + ";\n");// 属性的名字+回车
		}
		Method[] methods = c.getMethods();
		for(Method me : methods) {
			System.out.println(me.getName() + ", ");  
		}
		sb.append("}");
		Object obj = c.newInstance();
		System.out.println( c.getClassLoader().toString());
		System.out.println(obj);
		System.out.println(sb);
	} 

}

