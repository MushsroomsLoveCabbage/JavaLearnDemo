package com.zxy.learning.jvm;

import java.lang.reflect.Field;

/**

 * @author zxy
 * @version 1.0.0
 * @ClassName StringTest.java
 * @Description
 * @createTime 2020年10月23日 20:29:00
 */
public class StringClassTest {

    public static final String SPLIT_COMMON = ",";

    public static void main(String[] args) {
        new StringClassTest().test();
    }

    /**
     * 测试 拼接字符串时候
     * 静态常量 和 直接使用字符的区别
     * 可以看出会优化为StringBuilder 的拼接方式
     * 然后使用常量和不使用常量都一样，最后生成的对象都是StringBuilder对象
     * 生成的都是新的对象
     */
    public void test(){
        int i = 1;
        int j = 2;
        int k = 3;
        //使用静态变量
        //  jvm 执行参考 (具体可以看The Java® Virtual Machine Specification)
        // https://www.jianshu.com/p/1ad68e2b8cc1
        /**
         *        6: new           #5                  // class java/lang/StringBuilder
         *        9: dup
         *       10: invokespecial #6                  // Method java/lang/StringBuilder."<init>":()V
         *       13: iload_1
         *       14: invokevirtual #7                  // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         *       17: ldc           #8                  // String ,
         *       19: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         *       22: iload_2
         *       23: invokevirtual #7                  // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         *       26: ldc           #8                  // String ,
         *       28: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         *       31: iload_3
         *       32: invokevirtual #7                  // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         *       35: invokevirtual #10                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         *       38: astore        4
         */
        String temp = i + SPLIT_COMMON + j + SPLIT_COMMON + k;
        //不使用静态变量
        /**
         *       40: new           #5                  // class java/lang/StringBuilder
         *       43: dup
         *       44: invokespecial #6                  // Method java/lang/StringBuilder."<init>":()V
         *       47: iload_1
         *       48: invokevirtual #7                  // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         *       51: ldc           #8                  // String ,
         *       53: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         *       56: iload_2
         *       57: invokevirtual #7                  // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         *       60: ldc           #8                  // String ,
         *       62: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         *       65: iload_3
         *       66: invokevirtual #7                  // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         *       69: invokevirtual #10                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         *       72: astore        5
         */
        String tempNew = i + "," + j + "," + k;
        try {
            new StringBuilder().toString();
            //会定义一个常量池常量
            String ori1 = "1,2,3";
            Field field = tempNew.getClass().getDeclaredField("value");
            field.setAccessible(true);
            Object object1 = field.get(tempNew);
            Object object2 = field.get(temp);
            String ori2 = new String("1,2,3").intern();
            String ori3 = new String("1,2,3").intern();
            Object object3 = field.get(ori1);
            Object object4 = field.get(ori2);
            Object object5 = field.get(ori3);
            String internString = tempNew.intern();
            Object object6 = field.get(internString);
            System.out.println(object1.hashCode() + " " +object2.hashCode() + "" + object3.hashCode() + "" + object4.hashCode());
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println();
    }

}
