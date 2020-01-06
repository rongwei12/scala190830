package com.atguigu.bigdata.java.sz;

public class TestDataTpe1 {
    //todo 类型转换问题
    public static void main(String[] args) {
        byte b =  10;
        test(b);
    }
   /* public static void test(byte b ) {
        System.out.println("bbbb");
    }*/
   /* public static void test(short s ) {
        System.out.println("ssss");
    }*/
   //char范围为0-65535，没有负数，故byte不能转换成char
    public static void test(char c ) {
        System.out.println("cccc");
    }
    public static void test(int i) {
        System.out.println("iiii");
    }
}
