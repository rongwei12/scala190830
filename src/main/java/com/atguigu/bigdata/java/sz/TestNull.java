package com.atguigu.bigdata.java.sz;

public class TestNull {
    public static void main(String[] args) {

        UserK user = new UserK();
        //System.out.println(user);
        //System.out.println(user.name);

        // 拆箱:Integer.intValue
        // 装箱:Integer.valueOf(int)
        //test(user.id);

        java.util.List<String> list = null;

        for ( String s : list ) {
            System.out.println(s);
        }

    }

    public static void test(int id) {
        System.out.println("打印主键 = " + id);
    }
}
class UserK {
    public static String name = "zhangsan";
    public Integer id = null;
}
