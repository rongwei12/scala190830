package com.atguigu.bigdata.scala.sz.chapter05

object Scala17_Trait {
    def main(args: Array[String]): Unit = {
        
        // 特质（特征）
        // 如果一个类拥有某一个特征，那么需要将这个特征混入到类中
        // 一个类可以混入多个特质
    }
}
// 混入特质 :
// 混入特质时，需要使用extends关键字，如果混入多个特质，需要使用with
class User17 extends MyTrait with  MyTrait1 {

}
class Emp17 extends MyTrait {

}
trait MyTrait1 {

}
