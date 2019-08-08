package com.zxy.learning.invoke;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectClass {
	public static void main(String[] args){
		Class class01 = null;
		Class class02 = null;
		Class class03 = null;
		/**
		 * 三种实例化class的方式
		 */
		try {
			class01 = Class.forName("com.zxy.learning.invoke.User");
			class02 = new User().getClass();
			class03 = User.class;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		class01.getSuperclass().getName();
		class02.getInterfaces();
		System.out.println(class01.getSuperclass().getName());
		//获取类的构造方法
		Constructor<?> constructor[] = class01.getConstructors();
		for(int i = 0; i < constructor.length; i++) {
			Class arrayClass[] = constructor[i].getParameterTypes();
			System.out.println("cons[" + i + "] (");
			for(int j = 0;j <arrayClass.length; j++) {
				if(j == arrayClass.length -1)
					System.out.println(arrayClass[j].getName());
				else
					System.out.println(arrayClass[j].getName() + ",");
			}
			System.out.println(")");
		}
		//获取类的所有属性
		Field field[]  = class01.getDeclaredFields();
		for(int i = 0; i < field.length; i++) {
			System.out.println(field[i].getName());
			//获取修饰权限符
			int mo = field[i].getModifiers();
			System.out.println("mo:" + mo);
			String priv = Modifier.toString(mo);
			Class type = field[i].getType();
			System.out.println(priv + " " + type.getName() + " " + field[i].getName()); 
		
		}
		
		Method method[] = class01.getDeclaredMethods();
		for(int i = 0; i < method.length; i++) {
			System.out.println(method[i].getName());
			Class returnType = method[i].getReturnType();
			System.out.println("returnType:" + returnType.getName());
			Class para[] = method[i].getParameterTypes();

            int temp = method[i].getModifiers();
            System.out.print("Modifier.toString: "+Modifier.toString(temp) + " ");
            System.out.print(returnType.getName() + "  ");
            System.out.print(method[i].getName() + " ");
            System.out.print("(");
            for (int j = 0; j < para.length; ++j) {
                System.out.print(para[j].getName() + " " + "arg" + j);
                if (j < para.length - 1) {
                    System.out.print(",");
                }
            }
            // 获取异常类型
            Class<?> exce[] = method[i].getExceptionTypes();
            if (exce.length > 0) {
                System.out.print(") throws ");
                for (int k = 0; k < exce.length; ++k) {
                    System.out.print(exce[k].getName() + " ");
                    if (k < exce.length - 1) {
                        System.out.print(",");
                    }
                }
            } else {
                System.out.print(")");
            }
            System.out.println();
		}
		
		
		try {
			//Method methodtest = class01.getMethod("setId");
			//methodtest.invoke(class01.newInstance(),10);
			Method mod = class01.getMethod("setName", String.class);
			mod.invoke(class01.newInstance(),"zxy");
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
