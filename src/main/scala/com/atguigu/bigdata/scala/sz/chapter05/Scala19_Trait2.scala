package com.atguigu.bigdata.scala.sz.chapter05

import _root_.java.io._

object Scala19_Trait2 {
    def main(args: Array[String]): Unit = {

        // 装饰者设计模式 ： IO
        //new BufferedInputStream(new FileInputStream(""))
        var userExt = new User199(new User19())
        userExt.update()
        userExt.insert()
        
        // OCP
        //user.update()
    
    }
}
class User19 {
    def insert(): Unit = {
        println("insert user data...")
    }
//    def update(): Unit = {
//        println("update user data...")
//    }
}
class User199( user:User19 ) {
    def insert(): Unit = {
        user.insert()
    }
    def update(): Unit = {
        println("update user data...")
    }
}