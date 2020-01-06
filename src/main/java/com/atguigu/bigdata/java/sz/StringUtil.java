package com.atguigu.bigdata.java.sz;

import java.util.*;

public class StringUtil {

    public static void main(String[] args) {

        System.out.println(new ArrayList());

        //20;
        //new Integer(20);
        boolean flg = false;
        int i = flg?1:2;

        String s = null;

        System.out.println(isNotEmpty(s));
    }

    public static boolean isNotEmpty( String s ) {
        return (s != null && !s.equals(""));
    }
}
