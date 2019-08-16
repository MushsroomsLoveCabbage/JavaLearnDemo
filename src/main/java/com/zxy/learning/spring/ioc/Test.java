/**
 * Creation Date:2017年12月7日-下午2:31:12
 * 
 * 
 */
package com.zxy.learning.spring.ioc;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Description Of The Class<br/>
 * 
 * 
 * @author zxy
 * @Connect Mail:1363320658@qq.com
 * @version 1.0.0, 2017年12月7日-下午2:31:12
 * @since 2017年12月7日-下午2:31:12
 */
public class Test {
	private static Fruit fruit;
	private static Person person;
	public static void main(String[] args) {
		/*fruit = Factory.getInstance("com.zxy.learning.spring.ioc.Apple");
		fruit.eat();*/
		 //传入参数
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("id", 1);
        map.put("name", "lz");
        map.put("age", 20);
        map.put("email", "qq@qq.com");
        map.put("qq", "100000");
        map.put("address", "tj");
        SpringInject(map);  
        person.toString();
	}
	
	public static void SpringInject(Map<String,Object> map) {
		 person=(Person) mapBean(Person.class.getName(),map);
	}
	public static Object mapBean(String className, Map<String, Object> map) {
		Object obj = null;
		try {
			obj = Class.forName(className).newInstance();
			/*for(String key : map.keySet()) {
				if(key != null && !"".equals(key)) {
					Character c = key.charAt(0);
					c = Character.toUpperCase(c);
					String temp = String.valueOf(c);
					if(key.length() > 1) {
						temp += key.substring(1);
					}
					Method[] methods = obj.getClass().getMethods();
					for(int i = 0; i < methods.length; i++ ) {
						if(methods[i].getName().contains("set" + temp)) {
							methods[i].invoke(obj, map.get(key));
							break;
						}
					}
				}
			}*/
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} /*catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return obj;
	}
}

