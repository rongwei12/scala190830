package com.atguigu.bigdata.scala.sz.chapter05

import _root_.java.io._
object Scala21_Trait4 {
    def main(args: Array[String]): Unit = {

        val user = new User21()

        // 如果一个类同时继承了父类，并混入了特质
        // 那么会优先初始化父类的相关内容
        // 然后初始化当前类的特质内容
        // 最后再初始化类的主体内容
    }
}
trait Trait211 {
    println("trait 211....1")
}
trait Trait21 extends Trait211{
    // 特质主体
    println("trait 21....3")
}
class Parent21 extends Trait211{
    println("parent...2")
}
class User21 extends Parent21 with Trait21 {
    println("user...4")
}
// B
// trait 211....
// trait 21....
// parent...
// user...

// A
//  trait 211....
//  parent...
// trait 21....
// user...



