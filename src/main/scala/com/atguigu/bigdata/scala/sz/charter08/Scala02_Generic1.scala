package com.atguigu.bigdata.scala.sz.charter08

object Scala02_Generic1 {
    def main(args: Array[String]): Unit = {
    
        // scala中泛型默认也是不可变的。
        
        // scala中也支持泛型可变
        // T  => 泛型不可变
        // +T => 泛型的协变（子类型）
        // -T => 泛型的逆变（父类型）
        
        // T <: 类型 => 下限
       //val test : Person[User] = new Person[Parent]()
       //val test : Person[User] = new Person[Child]()
    
        //val test : Person[User] = new Person1[Child]()
        //println(test)
        //println(test)
        
        //test(new User())
        //test(new Parent()) //error
        //test(new Child())
        
        //test1( new User() )
        //test1( new Parent() )
        //test1( new Child() )
    
        //println(new Person[User]())
       // println(new Person[Child]()) // error
        //println(new Person[Parent]())
    
        println(new Person1[User]())
        println(new Person1[Child]())
       // println(new Person1[Parent]()) // error
    }
    // 上限
    def test[T<:User]( t:T ): Unit ={
        println(t)
    }
    
    // 下限, 在方法声明上不起作用
    def test1[T>:User]( t:T ): Unit ={
        println(t)
    }
}
// 下限
class Person[T>:User] {

}
// 上限
class Person1[T<:User] {

}
