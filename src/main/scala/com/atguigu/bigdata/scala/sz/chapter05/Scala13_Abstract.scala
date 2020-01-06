package com.atguigu.bigdata.scala.sz.chapter05

object Scala13_Abstract {
    def main(args: Array[String]): Unit = {

        // TODO 面向对象 - 抽象
        new User13().test()

    }
}
// 声明抽象类 : 声明类时，在class前使用关键字abstract
abstract class Parent13() {

    // 声明普通方法
    def test(): Unit = {
        println("parent....")
        test1()
    }

    // 声明抽象方法：只有声明，没有实现
    // 只要方法声明不完整，那么就是抽象的，所以不需要使用abstract关键字
    def test1(): Unit
}
// 子类如果继承抽象类，那么必须重写抽象方法或声明为抽象类
/* Scala中重写分为两种情况:
 抽象方法的重写：只要将方法补充完整就可以，不用增加任何的修饰符
 完整方法的重写：为了明确方法是用于重写，所以需要增加修饰符*/
class User13() extends Parent13() {
    override def test(): Unit = {
//        println("user....")
        test1()//间接遵循动态绑定机制
    }

    // 将抽象方法补充完整
    def test1(): Unit = {
        println("user....")
    }
}