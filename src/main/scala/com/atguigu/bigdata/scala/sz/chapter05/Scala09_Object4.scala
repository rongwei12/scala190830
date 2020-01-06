package com.atguigu.bigdata.scala.sz.chapter05

object Scala09_Object4 {
    def main(args: Array[String]): Unit = {
        
        // TODO 面向对象 - 构造方法
        val user01 = new User09("zhangsan")

        //user01.username
        //user01.name
 
    }
}
// Scala中可以在声明构造参数时直接生成属性
// Sccala可以在声明构造参数时使用修饰符(var|val)
class User09(val username:String) {
    //var name : String = username
    
}