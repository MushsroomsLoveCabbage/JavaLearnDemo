/**
 * Creation Date:2017年12月7日-下午1:51:46
 * 
 * 
 */
package com.zxy.learning.spring.ioc;

/**
 * Description Of The Class<br/>
 * 
 * 
 * @author zxy
 * @Connect Mail:1363320658@qq.com
 * @version 1.0.0, 2017年12月7日-下午1:51:46
 * @since 2017年12月7日-下午1:51:46
 */
public class StudentInvoke extends PersonInvoke{
	private void method1(Integer age) {
		System.out.println("Student private void method1, age =: " + age);
	}
	public void testGetSuperClass() throws Exception {
		String className = "com.zxy.learning.spring.ioc.StudentInvoke";
		Class clazz  = Class.forName(className);
		Class superClazz = clazz.getSuperclass();
		System.out.println(superClazz);
	}
}

