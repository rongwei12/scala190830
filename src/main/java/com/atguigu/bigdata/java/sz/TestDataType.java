package com.atguigu.bigdata.java.sz;

public class TestDataType {
    public static void main(String[] args) {

//        byte b = 127;
//        int i = b + 1;
//        // 00000000 00000000 00000000 10000000
//        //                            10000000
//        // - 128
//        b = (byte)i;

        byte b = 127;
        b = ++b; // 128 => byte => -128

//        int i = 0;
//        int j = (i++); // _tmp = i++ = 0, i =1; j = _tmp = 0
//        // j = 0; i = 1

//        int i = 0;
//        i = i++;



        System.out.println(b);

    }
}
