package com.zxy.learning.basic;

public class StringBasic {
	public static void main(String[] args){
		
		String a = "abc";
		String b = "abc";
		System.out.println(a.equals(b));
		
		String str = new StringBuilder("go").append("od").toString();
		//System.out.println(str.intern() ==  str);
		
		String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program";
        String s4 = "ming";
        String s5 = "Program" + "ming";
        String s6 = s3 + s4;
        System.out.println(s1 == s2);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1.hashCode() + "/" + s2.hashCode() + "/" + s3.hashCode() + "/" + s4.hashCode() + "/" + s5.hashCode() + "/" + s6.hashCode());
        System.out.println(s1 == s6.intern());
        System.out.println(s2 == s2.intern());        
	}
	/**
	 * 字符串反转 递归  加第一个字母（）
	* @Title: reverse 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param orginalStr
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws
	 */
	public static String reverse(String orginalStr){
		if(orginalStr == null || orginalStr.length() <= 1)
			return orginalStr;
		return reverse(orginalStr.substring(1)) + orginalStr.charAt(0);
	}
	
}
