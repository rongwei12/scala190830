package com.atguigu.bigdata.scala.sz.chapter05

object Scala10_Object5 {
    def main(args: Array[String]): Unit = {
        
        // TODO 面向对象 - 构造方法
//        val user01 = new User10()
        val user = User10.newInstance()
        
    }
}
//类私有，通过伴生对象调用
class User10 private() {
    var name : String = ""
    
}
// 伴生对象可以访问伴生类中的私有内容
object User10 {
    def newInstance(): User10 = {
        new User10()
    }
}