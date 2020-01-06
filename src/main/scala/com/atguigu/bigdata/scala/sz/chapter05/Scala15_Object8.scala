package com.atguigu.bigdata.scala.sz.chapter05

object Scala15_Object8 {
    def main(args: Array[String]): Unit = {
        
        // TODO 面向对象 - 单例对象
        val user: User15.type = User15
        
        println(user)
        
    }
}
// 伴生对象
// 单例对象
object User15 {

}