package com.atguigu.bigdata.java.sz;

public class TestProtected {
    public static void main(String[] args) throws Exception {

        // 访问权限
        // 方法的提供者：com.atguigu.bigdata.java.sz.EmpX
        // 方法的调用者：com.atguigu.bigdata.java.sz.TestProtected
        EmpX emp = new EmpX();
        emp.clone();

    }
}
class EmpX {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
