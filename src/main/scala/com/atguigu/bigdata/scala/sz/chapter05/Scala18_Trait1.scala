package com.atguigu.bigdata.scala.sz.chapter05

object Scala18_Trait1 {
    def main(args: Array[String]): Unit = {
        
        // 特质从实现原理上其实就是个interface 和抽象类的集合体
        // 所以当使用extends来混入特质时，其实采用的接口的实现implements
        val emp = new Emp18()
        //emp.test1()
        println(emp.pname)
    
    }
}
class Parent18 {
    var pname : String = "lisi"
}
// 如果一个类只有特质，没有父类，那么可以直接使用extends来混入特质
// 如果一个类又有父类，又有特质，那么使用extends来继承父类，使用with来混入特质
// 可以让特质继承父类
//class Emp18 extends MyTrait18{
//class Emp18 extends Parent18 with MyTrait18 {
class Emp18 extends MyTrait18{
    
    def test():Unit = {
    
    }
}
trait MyTrait18 extends Parent18{
    // 声明属性
    // 在特质中声明属性，等同于声明属性的抽象set,get方法
    var num : Int = _
    // 声明抽象方法
    def test():Unit
    // 声明完整的方法
    // 在编译后，会调用一个特殊的类完成方法的调用
    def test1(): Unit = {
        println("xxxx")
    }
}
