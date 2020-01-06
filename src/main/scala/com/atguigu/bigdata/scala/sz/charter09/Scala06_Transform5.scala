package com.atguigu.bigdata.scala.sz.charter09

object Scala06_Transform5 {

    def main(args: Array[String]): Unit = {
        
        // Scala可以使用隐式类来扩展功能
        // 在类的声明前增加implicit关键字，这个类就是隐式类，可以自动完成隐式转换
        // A类 => B类
        // 隐式类必须有主构造函数，且必须只有一个参数
        
        val user = new User()
        user.insertUser()
        user.updateUser()
    }
    class User {
        def insertUser(): Unit = {
            println("insert user....")
        }
    }
    implicit class ExtUser(user:User) {
        def updateUser(): Unit = {
            println("update user...")
        }
    }
}

