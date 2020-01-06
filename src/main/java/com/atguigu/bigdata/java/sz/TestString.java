package com.atguigu.bigdata.java.sz;

import java.lang.reflect.Field;

public class TestString {
    public static void main(String[] args) throws Exception {

        String[] ss = new String[2];
        ss[0] = "a";
        ss[1] = "b";

        System.out.println(ss);

        for ( String s : ss ) {
            System.out.println(s);
        }

        // 不可变字符串：字符串的值无法改变，内容可变，只是String类没有提供任何改变内容的方法。
        String s = " a b ";
        //s = s.trim();

        //System.out.println("!"+s+"!");
        // !a b!
        // !ab!
        // ! a b !

        // 反射修改字符串内容
        Field value = String.class.getDeclaredField("value");
        value.setAccessible(true);
        char[] o = (char[])value.get(s);
        o[2] = 'd';

        System.out.println(s);

    }
}
