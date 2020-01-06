package com.atguigu.bigdata.scala.sz.chapter05

object Scala07_Object2 {
    def main(args: Array[String]): Unit = {
        
        // TODO 面向对象 - 构造方法
        /*
        class User {
            public User() {
            
            }
        }
        
        new User();
         */
        new User07()
        // Scala万物皆对象，万物皆函数
        // 声明类等同于声明函数
        // 构建对象时，类的主体内容会执行,完成类的初始化
 
    }
}
// 声明类
// 声明构造方法，在类名后增加参数列表
class User07() {
    // TODO 类的主体
    // TODO 函数的主体
    println("user07......")
    var age : Int = _
    
    // 声明普通方法
//    def User07: Unit = {
//        println("xxxxxx")
//    }
    
    // 声明属性（变量）
    var name : String = "zhangsan"
    
}