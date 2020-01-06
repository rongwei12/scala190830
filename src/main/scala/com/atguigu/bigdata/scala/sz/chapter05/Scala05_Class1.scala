package com.atguigu.bigdata.scala.sz.chapter05

import scala.beans.BeanProperty


object Scala05_Class1 {
    def main(args: Array[String]): Unit = {
        
        // TODO 面向对象 - class - 方法
        
        val emp = new Emp1()

        emp.test("ssssss")
    }
}

class Emp1 {
    // 声明方法
    // 方法可以重载和重写
    def test(): Unit = {
        println("xxxxx")
    }
    
    def test( s : String ): Unit = {
        println("s = " + s)
    }
}