package com.atguigu.bigdata.scala.sz.chapter05

import _root_.java.io._

object Scala20_Trait3 {
    def main(args: Array[String]): Unit = {

        // Scala支持对象动态混入特质
        // 创建对象时，可以动态添加功能。
        var user = new User20() with Trait20
        user.insert()
        user.update()
    }
}
class User20 {
    def insert(): Unit = {
        println("insert user data...")
    }
}
trait Trait20 {
    def update(): Unit = {
        println("update user data...")
    }
}
