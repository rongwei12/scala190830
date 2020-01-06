package com.atguigu.bigdata.java.sz;

public class TestDataTpe2 {
    //todo 类型转换问题
    public static void main(String[] args) {
        A a = new B();//A类型，运行B
        test(a);
    }

//    char范围为0-65535，没有负数，故byte不能转换成char
    public  static void test(A c) {
        System.out.println("aaaa");
    }

    public static void test(B i) {
        System.out.println("bbbb");
    }


}
class A {

}

class B extends A {

}