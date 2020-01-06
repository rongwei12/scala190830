package com.atguigu.bigdata.java.sz;

// bin/java TestFinally => jvm => TestFinally Process
public class TestFinally {
    public static void main(String[] args) {
        System.out.println(test());
    }
    public static void test1() {
        return;
    }
    public static int test() {
        // _rtnVal
        int i = 0;

        //try {
            new XX().test();
            return i;
            //return i++;// 1) _tmp = 0; i = 1； 2）_rtnVal = _tmp; 3) return _rtnVal
       // } finally {
            //return ++i; // 4) _tmp1 = 2; i = 2；5) _rtnVal = _tmp1; 6) return _rtnVal
        //    ++i;
        //}
    }
}
class XX {
    public void test() {
        // ... TestFinally
//        try {
//            throw new RuntimeException("xxxx");
//        }catch( Exception e ) {
//            StackTraceElement[] stackTrace = e.getStackTrace();
//            for ( StackTraceElement ste : stackTrace ) {
//                ste.getMethodName().equals("main");
//                        ste.getClassName()
//            }
//        }
    }
}
