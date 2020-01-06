package com.atguigu.bigdata.scala.sz.chapter05

object Scala06_Object1 {
    def main(args: Array[String]): Unit = {
        
        // TODO 面向对象
        //val user:User06 = new User06()
        
        //user.name = "lisi"
 
    }
}
// 声明类
class User06 {
    // 声明属性（变量）
    var name : String = "zhangsan"
    
    // 声明方法（函数）
    def login(): Boolean = {
        true
    }
}