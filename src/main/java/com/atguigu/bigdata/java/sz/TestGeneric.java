package com.atguigu.bigdata.java.sz;
import java.util.*;
public class TestGeneric {
    public static void main(String[] args) {

        //ParentTest parent = new UserTest();
        //UserTest user = new ParentTest();

        // java中泛型不可变
        // 泛型其实就是对数据类型的约束
        List list = new ArrayList();
        list.add(new EmpTest());

        //List<UserTest> userList = new ArrayList<UserTest>();
        // 泛型无法对声明之前的数据类型做约束
        // 只能对声明之后的操作进行类型约束
        List<UserTest> userList = list;
        //userList.add(new UserTest());
        //userList.add(new ParentTest());
        //userList.add(new ChildTest());

        //System.out.println(userList);
        // 泛型一般在进行类型操作的时候会出错，如果不进行类型操作，那么就不会有问题
        for ( UserTest user : userList ) {
            System.out.println(user);
        }

    }
}
class ParentTest {

}
class UserTest extends ParentTest {

}
class ChildTest extends UserTest {

}
class EmpTest {

}
