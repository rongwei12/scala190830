package com.atguigu.bigdata.scala.sz.chapter05

object Scala11_Object6 {
    def main(args: Array[String]): Unit = {
        
        // TODO 面向对象 - 继承
        new User11("lisi")

        
    }
}
// 父类中一般的属性和方法都使用protected关键字声明访问权限
// 构造方法
class Parent11(name:String) {
    println("name = " + name)
}
// Scala中继承也采用extends关键字,只支持单继承
// 如果父类存在构造参数，那么在继承时可以直接传递构造参数
class User11(name:String) extends Parent11(name) {

}