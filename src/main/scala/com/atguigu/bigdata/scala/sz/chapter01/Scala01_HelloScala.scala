package com.atguigu.bigdata.scala.sz.chapter01


  //Scala是完全面向对象的语言，根本就没用静态语法,无法直接实现静态语法调用
/* Scala中如果一个类使用object进行声明，编译的时候会产生两个类文件。
    第一个类文件是当前类名的编译class文件
    第二个类文件是当前类名加上$的编译的class文件，运行时，会使用单例模式创建单一对象进行调用
  所以有时会将使用object关键字声明的类型称之为伴生对象（单例对象，带$）。
  将产生伴生对象的那个类称之为伴生类，使用class关键字声明的。
 */
//Scala采用object关键字来模拟java的静态语法，可以通过类名直接访问方法
object Scala01_HelloScala {
  //Scala语法中声明方法使用def关键字
  /*  参数列表：
      java ：String[] args            => 类型 名称   （强类型语言）
      scala ：args ：Array[String]     => 名称: 类型   (看重场景和名称）
   */
  //Unit(类型) => void(关键字)
  //等号后面是方法体
  def main(args:Array[String]): Unit = {
    println("good morning sir2")
  }
}
