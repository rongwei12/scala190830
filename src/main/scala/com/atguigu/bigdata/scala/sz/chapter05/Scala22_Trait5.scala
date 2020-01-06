package com.atguigu.bigdata.scala.sz.chapter05

import _root_.java.io._
object Scala22_Trait5 {
    def main(args: Array[String]): Unit = {

        val user = new User22()
        // trait 22....
        // trait 2222....
        // trait 222....
        // user...
    }
}
trait Trait22 {
    println("trait 22....")
}
trait Trait222 extends Trait22{
    // 特质主体
    println("trait 222....")
}
trait Trait2222 extends Trait22 {
    // 特质主体
    println("trait 2222....")
}

class User22 extends Trait2222 with Trait222 {
    println("user...")
}


