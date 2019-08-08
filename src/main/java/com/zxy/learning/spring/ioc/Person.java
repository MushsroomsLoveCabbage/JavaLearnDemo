/**
 * Creation Date:2017年12月7日-下午4:14:16
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
 * @version 1.0.0, 2017年12月7日-下午4:14:16
 * @since 2017年12月7日-下午4:14:16
 */
public class Person {
	private int id;
	private String name;
	private int age;
	private String email;
	private String address;
	private String qq;
	
	
	public Person() {
		super();
	}
	public Person(int id, String name, int age, String email, String address, String qq) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
		this.qq = qq;
	}
	public String toString() {
		System.out.println(id + name + age + email + address + qq);
		return id + name + age + email + address + qq;
		
	} 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	
}

