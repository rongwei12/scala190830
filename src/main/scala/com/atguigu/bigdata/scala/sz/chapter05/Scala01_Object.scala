package com.atguigu.bigdata.scala.sz.chapter05

object Scala01_Object {
    def main(args: Array[String]): Unit = {
        
        // TODO 面向对象
 
        /*
        java :
        
        package com.atguigu.*;
        import java.util.*;
        
        public class User extends Object implments Interface {
            
            public User() {
            
            }
            
            private String name;
            public void setName() {
            
            }
            public String getName() {
            
            }
            
            publoc boolean login() {
            
            }
        
        }
        
         */
        // java创建对象
        // User user = new User()
        // user.name
        // user.login
        // Scala创建对象
        var user : User = new User()
        println(user.name)
        println(user.login())
    }
}
// 声明类
class User {
    // 声明属性（变量）
    var name : String = "zhangsan"
    
    // 声明方法（函数）
    def login(): Boolean = {
        true
    }
}