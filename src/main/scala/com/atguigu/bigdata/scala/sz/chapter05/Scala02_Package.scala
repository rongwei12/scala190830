package com.atguigu.bigdata.scala.sz.chapter05

import com.atguigu.bigdata.scala.sz.chapter05.xxxxx._

package object xxxxx {
    val name : String = "zhangsan"
    def test(): Unit = {
    
    }
}
class Test {

        // 私有的
        private var username : String = "zhangsan"

        // 公共的
        def test(): Unit = {
            println(email)
        }

        // 包私有权限
        private[chapter05] var age : Int = 20

        //受保护的访问权限
        protected var email :String = ""
    }
class Test1 {

        // 私有的
        private var username : String = "zhangsan"

        // 公共的
        def test(): Unit = {
            println(email)
        }

        // 包私有权限
        private[chapter05] var age : Int = 20

        //受保护的访问权限
        protected var email :String = ""
    }

    object Scala02_Package {
            def main(args: Array[String]): Unit = {

                // TODO 面向对象 - 包
                // JAVA中包的作用
                // 1. 分类管理
                // 2. 区分相同名称的类： Date
                // 3. 访问权限
                // Scala语言对package的语法进行了扩展
                // 1. 包路径和源码文件所在的路径没有关系
                // 2. package关键字可以多次声明,形成父包，子包的概念
                // 3. package可以嵌套使用
                // 4. 子包可以直接使用父包中的内容, 不需要导包
                // 5. java.lang.*, scala.*, Predef.* 无需导入
                // 6. scala是完全面向对象的语言，所以万物皆对象，所以，package也是对象
                // 7. 权限：scala中什么都不写，就是public公共的访问权限。
                //          scala中private语法和java一样
                //          scala中包访问权限可以让指定的包和子包同时访问
                //          scala中protected访问权限只能给当前类，和子类访问，同包无法使用。
                //new Test().email
            }
        }




