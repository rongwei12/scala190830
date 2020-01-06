package com.atguigu.bigdata.scala.sz.charter08

object Scala01_Generic {
    def main(args: Array[String]): Unit = {
    
        // scala中泛型默认也是不可变的。
        
        // scala中也支持泛型可变
        // T  => 泛型不可变
        // +T => 泛型的协变（子类型）
        // -T => 泛型的逆变（父类型）
       val test : Test[User] = new Test[Child]()
        
        println(test)
    }
}
class Parent {

}
class User extends Parent {

}
class Child extends User {

}
class Test[+T] {

}
