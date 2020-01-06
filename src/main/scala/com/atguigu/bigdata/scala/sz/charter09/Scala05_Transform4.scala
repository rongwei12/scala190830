package com.atguigu.bigdata.scala.sz.charter09

object Scala05_Transform4 {

    def main(args: Array[String]): Unit = {

        implicit def transform( u : User ): ExtUser = {
            new ExtUser()
        }
        
        val user = new User()
        user.insertUser()
        user.updateUser()
    }
    class User {
        def insertUser(): Unit = {
            println("insert user....")
        }
    }
    
    class ExtUser {
        def updateUser(): Unit = {
            println("update user...")
        }
    }

}
