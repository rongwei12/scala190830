package com.atguigu.bigdata.java.sz;

public class TestOverwrite {
    public static void main(String[] args) {

    }
}
class E {
    public int i = 10;
    public int getSum() {
        return i + 10;
    }
}
class F extends E {
    public int i = 10;
    public int getSum() {
        return i + 10;
    }
}
