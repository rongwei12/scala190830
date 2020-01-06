package com.atguigu.bigdata.java.sz;

import java.lang.reflect.Field;

public class TestString1 {
    //static
    public static void main(String[] args) throws Exception {

        // 不可变字符串
        // String s = "a".trim()
        // 可变字符串
        // StringBuffer, StringBuilder
        // buffer.append("aaa");
        StringBuilder buff = new StringBuilder();
        String s = "";
        for ( int i = 0; i < 100000000000L; i++ ) {
            s = s + i;
            buff.append(i);
        }
        System.out.println("s = " + s);



        // 线程安全
        // 所谓的线程安全问题，其实多线程并发执行时，对共享内存中的共享对象的属性进行修改时
        // 所导致的数据冲突问题

        // 多线程 ： 单线程
        // 共享内存 ：多线程共享的内存 ：堆内存，方法区内存
        //          :将对象放置在独享内存中（栈上分配，逃逸分析）
        // 共享对象 ：多线程访问的是同一个对象 ： Servlet
        //          ： 多例，每一个线程使用一个对象 : Struts2 => SSH =>
        // 属性 : 对象属性只有一个，方法
        // 修改 ： 多线程同时修改
//        Dept2 dept = new Dept2();
//
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                dept.name = "开发部";
//                try {
//                    Thread.sleep(1000);
//                } catch ( Exception e ) {
//                    e.printStackTrace();
//                }
//                System.out.println(dept.name);
//            }
//        });
//
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                dept.name = "测试部";
//                try {
//                    Thread.sleep(1000);
//                } catch ( Exception e ) {
//                    e.printStackTrace();
//                }
//                System.out.println(dept.name);
//            }
//        });
//
//        t1.start();
//        t2.start();
//
//        System.out.println("main方法执行完毕");
        // main方法执行完毕
        // 开发部（测试部）
        // 测试部（开发部）


    }
}
class Dept2 {
    public String name = "";
}
