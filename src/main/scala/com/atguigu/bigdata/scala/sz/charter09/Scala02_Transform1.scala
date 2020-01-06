package com.atguigu.bigdata.scala.sz.charter09

object Scala02_Transform1 {
    def main(args: Array[String]): Unit = {

        implicit def transform( user:User ): ExtUser = {
            new ExtUser()
        }
        
        val user = new User() // new ExtUser()
        user.insert()
        user.update()
    }
    class User {
        def insert(): Unit = {
            println("insert User....")
        }
    }
    class ExtUser {
        def update(): Unit = {
            println("update User....")
        }
    }

}
