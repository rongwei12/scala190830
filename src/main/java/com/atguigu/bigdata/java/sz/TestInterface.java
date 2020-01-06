package com.atguigu.bigdata.java.sz;

public class TestInterface {
    public static void main(String[] args) {
        G g = new H();
        H h = new I();
        // 多态的传递
        g = h;
        //System.out.println(g);
        System.out.println( I.class.getInterfaces().length );
    }
}
interface G {

}
class H implements G {

}
class I extends H {

}