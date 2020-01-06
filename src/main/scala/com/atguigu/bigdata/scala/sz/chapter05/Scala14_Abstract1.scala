package com.atguigu.bigdata.scala.sz.chapter05

object Scala14_Abstract1 {
    def main(args: Array[String]): Unit = {
        
        // TODO 面向对象 - 抽象属性
        println(new User14().age)
        
        // 匿名子类
//        new Parent14() {
//            override var age: Int = _
//        }
        // 多态 : Java
        //val user : User14 = new User14();
        //val person : Parent14 = user;
        // Scala中多态不能省略类型
        val user = new User14()
        val person = user
        
    }
}

abstract class Parent14() {
    // 完整属性
    val name : String = "xxxx"
    
    // 抽象属性：只有声明，而没有初始化
    // 编译时，不会生成类的私有属性，而是会生成属性的对应的set,get方法，但是都是抽象的
    var age : Int
    
    def test(): Unit = {
//        name = "wangwu"
//
        println(name)
    }
}

class User14 extends Parent14 {
    
    // 如果将父类完整的内容进行重写，必须使用override关键字
    // 可变的变量不能被重写，使用val的原因是防止歧义
    override val name : String = "1123"
    
    // 将抽象属性补充完整
    var age : Int = 20
}