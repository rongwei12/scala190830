package com.atguigu.bigdata.java.sz;

import static com.atguigu.bigdata.java.sz.StringUtil.*;

public class TestAddAdd {
    public static void main(String[] args) {

        // 递归：阶乘
        // 阶乘 : 一个大于1的数的阶乘等于这个数乘以这个数减一的阶乘
        // 5! = 5 * 4! = 5 * 4 * 3! = 5 * 4 * 3 * 2! = 5 * 4 * 3 * 2 * 1
        int result = testProduct(5);

        System.out.println(result);

        isNotEmpty("zhangsan");
    }
    public static int testProduct( int num ) {
        if ( num == 1 ) {
            return 1;
        } else {
            return num * testProduct(num-1);
        }
    }
}
