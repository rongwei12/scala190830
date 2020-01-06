package com.atguigu.bigdata.java.sz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException {
    public static void main(String[] args) {
        FileInputStream in;

        try {
            in = new FileInputStream("xxxxx");
            Class.forName("xxxxx");
        } catch ( FileNotFoundException e1 ) {

        } catch ( ClassNotFoundException e2 ) {

        } catch( Exception e) {


        }


    }
}
