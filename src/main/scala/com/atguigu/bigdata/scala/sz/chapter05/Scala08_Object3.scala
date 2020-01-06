package com.atguigu.bigdata.scala.sz.chapter05

object Scala08_Object3 {
    def main(args: Array[String]): Unit = {
        
        // TODO 面向对象 - 构造方法
        val user01 = new User08()
        val user02 = new User08("zhangsan")
 
    }
}

// Scalaz中的构造方法分为两大类：主构造方法 & 辅助构造方法
// 在类名后增加参数列表的方式称之为主构造方法，主要目的用于类的初始化
// 在类中声明的构造方法称之为辅助构造方法，用于辅助主构造方法完成一些初始化的操作,类似于java中构造方法的重载
// 辅助构造方法的声明采用关键字this来声明
// 辅助构造方法构造方法不能直接构建对象，没有办法完成类的初始化，必须直接或间接调用主构造方法
// 调用构造方法时，被调用的辅助构造方法必须提前声明
class User08() {
    var name : String = "zhangsan"

    def this(name : String) {
        this()
    }
    
    def this(name : String, age:Int) {
        this(name)
    }
    
}