package com.atguigu.bigdata.scala.sz.chapter05

object Scala23_Trait6 {
    def main(args: Array[String]): Unit = {
        new UserA05().test()
    }
}

trait UserA01{
    def test(): Unit ={
        println("11111")
    }
}
trait UserA02 extends UserA01{
    override def test(): Unit ={
        println("22222")
        super.test()
    }
}

trait UserA03 extends UserA04{
    override def test(): Unit ={
        println("33333")
        super.test()
    }
}

class UserA04 extends UserA01{
    override def test(): Unit ={
        println("44444")
        super.test()
    }
}
class UserA05 extends UserA04 with UserA02 with UserA03 with UserA01{
    override def test(): Unit ={
        println("55555")
        super.test()
    }
}