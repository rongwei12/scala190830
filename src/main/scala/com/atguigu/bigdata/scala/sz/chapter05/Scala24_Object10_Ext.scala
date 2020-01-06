package com.atguigu.bigdata.scala.sz.chapter05

import _root_.java.io._

object Scala24_Object10_Ext {
    def main(args: Array[String]): Unit = {

        val user1 = new User24()
        user1.id = 1
        
        val user2 = new User24()
        user2.id = 1
        
        println(user1.equals(user2))
        
        // 获取类的信息
        val c: Class[User24] = classOf[User24]
        
    }
}
class User24 {
    var id : Int = _
    
    override def equals(o: Any): Boolean = {
        // Scala语言中中括号表示泛型
        
        // isInstanceOf 判断是否为指定类型的实例
        if ( o.isInstanceOf[User24] ) {
            // asInstanceOf 将对象转换为指定类型的实例
            val other: User24 = o.asInstanceOf[User24]
            this.id == other.id
        } else {
            false
        }
    }
}

