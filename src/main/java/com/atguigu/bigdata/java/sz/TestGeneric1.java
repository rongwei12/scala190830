package com.atguigu.bigdata.java.sz;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric1 {
    public static void main(String[] args) {

        //test( new UserTest() );

        //test1( new UserTest() );
        //test1( new ParentTest() );// error
        //test1( new ChildTest() );

        //test2(UserTest.class);
        //test2(ChildTest.class);//error
        //test2(ParentTest.class);

        test3(UserTest.class);
        //test3(ParentTest.class);// error
        test3(ChildTest.class);
    }
    public static <T> void test( T t ) {
        System.out.println(t);
    }
    // 上限
    public static <T extends UserTest> void test1( T t ) {
        System.out.println(t);
    }
    // 下限
    public static void test2( Class<? super UserTest> c ) {
        System.out.println(c);
    }
    // 上限
    public static void test3( Class<? extends UserTest> c ) {
        System.out.println(c);
    }
}

