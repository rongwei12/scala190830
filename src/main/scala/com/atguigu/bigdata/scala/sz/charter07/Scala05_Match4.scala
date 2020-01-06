package com.atguigu.bigdata.scala.sz.charter07

object Scala05_Match4 {
  def main(args: Array[String]): Unit = {

    //todo - 模式匹配 - 样例类
    //样例类的作用其实就是为了模式匹配
    //所以和普通类的声明方式不一样

    //Student("zhangsan").name = "wangwu"

  }
}
class User{

}
//样例类使用case关键字声明
//样例类的构造参数列表不能省略
//当类声明为样例类时，编译器会自动生成伴生类和伴生对象，而且同时会生成大量的方法
//样例类和普通类基本一致
//样例类如果声明构造参数，等同于声明类的属性，而且不能改变，类似于参数增加了val关键字，可以修改修饰符
case class Student(var name:String){
  //def apply(name: String): Student = new Student()
  //def apply(): Student = new Student()

}
