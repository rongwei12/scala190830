package com.atguigu.bigdata.scala.sz.charter09

import com.atguigu.bigdata.scala.sz.charter09.Scala07_Transform6.User

object Scala07_Transform6 extends TestXXX{
    
    def main(args: Array[String]): Unit = {
        //todo 隐式解析机制 --需要与有隐式类的类有关联
        
        val user = new User()
        user.insertUser()
        user.updateUser()
    }
    class User {
        def insertUser(): Unit = {
            println("insert user....")
        }
    }
    
}
trait TestXXX {

}
object TestXXX {
    //隐式类必须被定义在“类”或“伴生对象”或“包对象”里，即隐式类不能是顶级的：不能做为一个单独的类
    implicit class ExtUser(user:User) {
        def updateUser(): Unit = {
            println("update user...")
        }
    }
}

